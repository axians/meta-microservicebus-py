SUMMARY = "Python node for microservicebus. Please visit https://microservicebus.com for more information."
HOMEPAGE = "https://pypi.org/project/microservicebus-py/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=7274cd045f25492b20f765c37bf16016"

#SRC_URI[md5sum] = "d2edc8bdbd0fa70032215eddd96b508f"
SRC_URI[sha256sum] = "26bfb332a0b54ca440f19c5f9abc7c5aa2602158ade4558b972bc236e9600eb3"

PYPI_PACKAGE = "microservicebus-py signalrcore"

inherit pypi setuptools3

# RDEPENDS_${PN} += " \
#     python3-psutil \
#     python3 \
#     python-pyopenssl \
#     python3-pip \
#     python3-misc \
#     libcurl \
# "
# RDEPENDS_${PN} += "	python3 \
# 					python3-dev \
# 					python3-pip \
#                     python-pyopenssl \
#                     python3-misc \
# 					python3-urllib3 \
# 					python3-requests \
# 					python3-psutil \
# 					python3-asyncio \
# 					python3-packaging \
# 					python3-pydbus \
# 					python3-pygobject \
# 					gobject-introspection \
#                     libcurl \
# 					"
