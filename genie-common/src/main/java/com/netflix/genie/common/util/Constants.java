/*
 *
 *  Copyright 2016 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.common.util;

/**
 * A class holding some constants to be used everywhere.
 *
 * @author amsharma
 * @since 3.0.0
 */
public final class Constants {

    /** Key used for look up of Job Execution environment object in a Context Map for workflows. **/
    public static final String JOB_EXECUTION_ENV_KEY = "jee";

    /** Key used for look up of File Transfer object in a Context Map for workflows. **/
    public static final String FILE_TRANSFER_SERVICE_KEY = "fts";

    /** Key used for look up of Job Execution DTO in a Context Map for workflows. **/
    public static final String JOB_EXECUTION_DTO_KEY = "jexecdto";

    /** The launcher script name that genie creates to setup a job for running. **/
    public static final String GENIE_JOB_LAUNCHER_SCRIPT = "run.sh";

    /** Delimiter to be used while creating file paths. **/
    public static final String FILE_PATH_DELIMITER = "/";

    /** Bash export command.  **/
    public static final String EXPORT = "export ";

    /** Equals symbol. **/
    public static final String EQUALS_SYMBOL = "=";

    /** File Path prefix to be used while creating paths for setup files downloaded by Genie to local dir. **/
    public static final String SETUP_FILE_PATH_PREFIX = "setup_file";

    /** File Path prefix to be used while creating paths for dependency files downloaded by Genie to local dir. **/
    public static final String DEPENDENCY_FILE_PATH_PREFIX = "dependencies";

    /** File Path prefix to be used while creating paths for config files downloaded by Genie to local dir. **/
    public static final String CONFIG_FILE_PATH_PREFIX = "config";

    /** Stderr Filename generated by Genie after running a job. **/
    public static final String  STDERR_LOG_FILE_NAME = "stderr";

    /** Stdout Filename generated by Genie after running a job. **/
    public static final String STDOUT_LOG_FILE_NAME = "stdout";

    /** Done filename generated by Genie after running a job. **/
    public static final String GENIE_DONE_FILE_NAME = "./genie/genie.done";

    /** Genie log file path. **/
    public static final String GENIE_LOG_PATH = "/genie/logs/genie.log";

    /** File Path prefix to be used while creating directories for application files to local dir. **/
    public static final String APPLICATION_PATH_VAR = "applications";

    /** File Path prefix to be used while creating directories for command files to local dir. **/
    public static final String COMMAND_PATH_VAR = "command";

    /** File Path prefix to be used while creating directories for cluster files to local dir. **/
    public static final String CLUSTER_PATH_VAR = "cluster";

    /** File Path prefix to be used while creating working directory for jobs. **/
    public static final String GENIE_PATH_VAR = "genie";

    /** File Path prefix to be used while creating working directory for jobs. **/
    public static final String LOGS_PATH_VAR = "logs";

    /** Environment variable for Genie working directory. **/
    public static final String GENIE_WORKING_DIR_ENV_VAR = "GENIE_WORKING_DIR";

    /** Environment variable for Genie job working directory. **/
    public static final String GENIE_JOB_DIR_ENV_VAR = "GENIE_JOB_DIR";

    /** Environment variable for Genie cluster directory. **/
    public static final String GENIE_CLUSTER_DIR_ENV_VAR = "GENIE_CLUSTER_DIR";

    /** Environment variable for Genie command directory. **/
    public static final String GENIE_COMMAND_DIR_ENV_VAR = "GENIE_COMMAND_DIR";

    /** Environment variable for Genie application directory. **/
    public static final String GENIE_APPLICATION_DIR_ENV_VAR = "GENIE_APPLICATION_DIR";

    /** Process ID. **/
    public static final String PID = "pid";


    /**
     * Enum containing types of files that the entities hold.
     *
     */
    public enum FileType {

        /** Configuration Files. **/
        CONFIG,

        /** Setup Files. **/
        SETUP,

        /** Other Dependencies. **/
        DEPENDENCIES
    }

    /**
     * Enum containing the four types of Entities in Genie.
     *
     */
    public enum EntityType {
        /** Application Entity. **/
        APPLICATION,

        /** Command Entity. **/
        COMMAND,

        /** Cluster Entity. **/
        CLUSTER,

        /** Job Entitity. **/
        JOB
    }

    /**
     * Protected constructor for utility class.
     */
    protected Constants() {
    }
}
