inherit systemd

SUMMARY = "Install microservicebus as systemd service and add dbus conf file"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "file://microservicebus-py.service "

S = "${WORKDIR}"

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = "microservicebus-py.service"

FILES_${PN} += "${systemd_system_unitdir}/microservicebus-py.service"

#Dynamic parameters for service file, set default values
MSB_PY_ARG ?= "-w"
MSB_PY_WORK_DIR ?= "/usr/local/bin/microservicebus-py"
MSB_PY_USER ?= "msbpy"
MSB_PY_GROUP ?= "msb"
MSB_PY_HOST ?= "microservicebus.com"

do_install() {
             
    #Replace parameters in service file
    sed -i -e 's:@MSB_PY_WORK_DIR@:${MSB_PY_WORK_DIR}:g' ${WORKDIR}/microservicebus-py.service
    sed -i -e 's:@MSB_PY_USER@:${MSB_PY_USER}:g' ${WORKDIR}/microservicebus-py.service
    sed -i -e 's:@MSB_PY_GROUP@:${MSB_PY_GROUP}:g' ${WORKDIR}/microservicebus-py.service
    sed -i -e 's:@MSB_PY_HOST@:${MSB_PY_HOST}:g' ${WORKDIR}/microservicebus-py.service

    #Install service file
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/microservicebus-py.service ${D}${systemd_system_unitdir}
}

REQUIRED_DISTRO_FEATURES= "systemd"