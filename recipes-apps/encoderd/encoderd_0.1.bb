SUMMARY = "Encoder daemon"
DESCRIPTION = "Encoder daemon"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/lczuba/encoderd.git;protocol=https;branch=main"
SRCREV="${AUTOREV}"
S = "${WORKDIR}/git"

inherit pkgconfig cmake

DEPENDS += " pigpio alsa-lib"

SRC_URI += "file://encoderd.service"
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "encoderd.service"

do_install_append() {
  install -d ${D}${systemd_system_unitdir}
  install -m 0755 ${WORKDIR}/encoderd.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += "${systemd_system_unitdir}"

