SUMMARY = "pigpio"
DESCRIPTION = "pgpio lib"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/joan2937/pigpio.git;protocol=https;nobranch=1"
SRCREV = "c33738a320a3e28824af7807edafda440952c05d"

S = "${WORKDIR}/git"

inherit pkgconfig cmake systemd

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

SRC_URI += "file://pigpiod.service"
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "pigpiod.service"

do_install_append() {
  install -d ${D}${systemd_system_unitdir}
  install -m 0755 ${WORKDIR}/pigpiod.service ${D}${systemd_system_unitdir}
}

SYSROOT_DIRS += "${bindir}"
FILES_${PN} += "/usr ${optdir} ${includedir} ${libdir} ${bindir} ${systemd_system_unitdir}"

