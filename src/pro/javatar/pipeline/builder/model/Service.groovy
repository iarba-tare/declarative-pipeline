package pro.javatar.pipeline.builder.model

import com.cloudbees.groovy.cps.NonCPS
import pro.javatar.pipeline.util.Logger
import pro.javatar.pipeline.util.StringUtils

class Service implements Serializable {

    String name

    String buildType

    Boolean useBuildNumberForVersion

    VcsRepoTO repo

    String vcsRepoId

    String orchestration

    Service() {
        Logger.debug("Service:default constructor")
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Service withName(String name) {
        this.name = name
        return this
    }

    String getBuildType() {
        return buildType
    }

    void setBuildType(String buildType) {
        this.buildType = buildType
    }

    Service withBuildType(String buildType) {
        this.buildType = buildType
        return this
    }

    Boolean getUseBuildNumberForVersion() {
        return useBuildNumberForVersion
    }

    void setUseBuildNumberForVersion(Boolean useBuildNumberForVersion) {
        this.useBuildNumberForVersion = useBuildNumberForVersion
    }

    Service withUseBuildNumberForVersion(Boolean useBuildNumberForVersion) {
        if (useBuildNumberForVersion == null) {
            this.useBuildNumberForVersion = false
        } else {
            this.useBuildNumberForVersion = useBuildNumberForVersion
        }
        return this
    }

    VcsRepoTO getRepo() {
        return repo
    }

    void setRepo(VcsRepoTO repo) {
        this.repo = repo
    }

    Service withRepo(VcsRepoTO repo) {
        this.repo = repo
        return this
    }

    String getVcsRepoId() {
        return vcsRepoId
    }

    void setVcsRepoId(String vcsRepoId) {
        this.vcsRepoId = vcsRepoId
    }

    Service withVcsRepoId(String vcsRepoId) {
        this.vcsRepoId = vcsRepoId
        return this
    }

    String getOrchestration() {
        return orchestration
    }

    void setOrchestration(String orchestration) {
        if (StringUtils.isNotBlank(orchestration)) {
            this.orchestration = orchestration
        }
    }

    Service withOrchestration(String orchestration) {
        setOrchestration(orchestration)
        return this;
    }

    @NonCPS
    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", buildType='" + buildType + '\'' +
                ", useBuildNumberForVersion=" + useBuildNumberForVersion +
                ", repo=" + repo +
                ", vcsRepoId='" + vcsRepoId + '\'' +
                ", orchestration='" + orchestration + '\'' +
                '}';
    }
}
