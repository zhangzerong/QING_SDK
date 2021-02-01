// +-------------------------------------------------------------------------
// | Copyright (C) 2016 Yunify, Inc.
// +-------------------------------------------------------------------------
// | Licensed under the Apache License, Version 2.0 (the "License");
// | you may not use this work except in compliance with the License.
// | You may obtain a copy of the License in the LICENSE file, or at:
// |
// | http://www.apache.org/licenses/LICENSE-2.0
// |
// | Unless required by applicable law or agreed to in writing, software
// | distributed under the License is distributed on an "AS IS" BASIS,
// | WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// | See the License for the specific language governing permissions and
// | limitations under the License.
// +-------------------------------------------------------------------------

package com.qingcloud.sdk.exception;

/** Created by karooli on 16/9/23. */
public class QCException extends Exception {
    /** */
    private static final long serialVersionUID = -5562309362764717920L;

    private String serviceName;

    private int errorCode;

    private String errorMessage;

    public QCException(String message, Throwable t) {
        super(message, t);
    }

    public QCException(String message) {
        super(message);
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return  "Action : "
                + getServiceName()
                + "; Error Code: "
                + getErrorCode()
                + "; Error Message: "
                + getErrorMessage()
                + ";\n Original Error Message:\n"
                + super.getMessage();
    }
}
