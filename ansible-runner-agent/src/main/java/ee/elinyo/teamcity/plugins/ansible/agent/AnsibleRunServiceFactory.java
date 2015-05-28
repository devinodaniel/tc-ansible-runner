package ee.elinyo.teamcity.plugins.ansible.agent;

import jetbrains.buildServer.agent.AgentBuildRunnerInfo;
import jetbrains.buildServer.agent.BuildAgentConfiguration;
import jetbrains.buildServer.agent.runner.CommandLineBuildService;
import jetbrains.buildServer.agent.runner.CommandLineBuildServiceFactory;
import ee.elinyo.teamcity.plugins.ansible.common.AnsibleRunnerConstants;

public class AnsibleRunServiceFactory implements CommandLineBuildServiceFactory, AgentBuildRunnerInfo {
    
    public AnsibleRunServiceFactory() {
        
    }

    @Override
    public String getType() {
        return AnsibleRunnerConstants.RUN_TYPE;
    }

    @Override
    public boolean canRun(BuildAgentConfiguration agentConfiguration) {
        // TODO
        //if (SystemInfo.isLinux)
        return true;
    }

    @Override
    public CommandLineBuildService createService() {
        return new AnsibleRunService();
    }

    @Override
    public AgentBuildRunnerInfo getBuildRunnerInfo() {
        return this;
    }
}
