def getVersionPkg(branchName){
  return getVersionBranch(branchName)
}

def getVersionBranch(branchName){
  println 'Branch: ' + branchName
  return branchName.FindAll(/((\d+).(\d+).(\d+)(\d+))/[0]);
}

// Git
env.getVersionBranch = getVersionBranch(gitlabBranch)

// Pacote Params
env.jiraKey = ""
env.siglaSistema = ""
env.pkgtype = ""
env.pkgArch = ""
env.pkgName = ""
env.pkgVersion = ""
env.publish = ""
env.repositoryName = ""

// URLS Params
env.UrlSonarQube = ""
env.UrlGit = ""

// Deploy Params
env.nodeGroupId = ""
env.pkgParmName = ""
env.className = ""
env.environment = ""

// Fortify Params
env.AppFortify = ""
env.Type = ""
env.mvnSet = ""
env.mvnPom = ""
env.shellFortify = ""
env.versaoFortify = ""
env.ScanFortify = ""

// Sonar Params
env.userIdSonar = ""

// Tools Params
env.mvnHome = tool (name: 'M3', type: 'maven')
env.mvnPath = "${tool 'M3'}/bin:${env.PATH}"
env.gitTool = "Git-Linux"
env.cleanWs = "${WORKSPACE}"
env.managedFiles = ""

// Artifactory
env.uploadServerId = ""

// Memory Params
env.memFlavor = "medium"
env.memory = "1024M"
env.Coverage = ""
