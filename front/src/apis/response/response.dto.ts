import {ResponseCode} from "../../types/enums";
import ResponseMessage from "../../types/enums/response-message.enum";

export default  interface ResponseDto{
    code: ResponseCode;
    message: ResponseMessage;
}