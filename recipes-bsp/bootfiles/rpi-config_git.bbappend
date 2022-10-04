do_deploy_append() {
  echo "# DAC device tree overlay" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
  echo "dtoverlay=hifiberry-dacplus" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
