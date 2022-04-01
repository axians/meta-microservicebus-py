DESCRIPTION = "Microservicebus-py packages dependencies"
LICENCE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = "	python3 \
					python3-pip \
					python3-urllib3 \
					python3-requests \
					python3-psutil \
					python3-asyncio \
					python3-packaging \
					python3-pydbus \
					microservicebus-py \
					microservicebus-py-service \
					microservicebus-py-user \
					signalrcore \
					websocket-client \
					msgpack \
					"
