package liquibase.util;

/**
 *
 * @author nico martens
 */
public class SqlPlusStatementsRemover {
    public static String remove(String sqlPlusFile){
        String content = removeSet(sqlPlusFile);
        content = removeWhenever(content);
        content = removeComment(content);
        content = removePrompt(content);
        content = removeAt(content);
        content = removeAccept(content);
        content = removeAppend(content);
        content = removeArchive(content);
        content = removeAttribute(content);
        content = removeBreak(content);
        content = removeBtitle(content);
        content = removeChange(content);
        content = removeClear(content);
        content = removeColumn(content);
        content = removeCompute(content);
        content = removeConnect(content);
        content = removeCopy(content);
        content = removeDefine(content);
        content = removeDel(content);
        content = removeDescribe(content);
        content = removeDisconnect(content);
        content = removeEdit(content);
        content = removeExecute(content);
        content = removeExit(content);
        content = removeGet(content);
        content = removeHelp(content);
        content = removeHost(content);
        content = removeInput(content);
        content = removeList(content);
        content = removePassword(content);
        content = removePause(content);
        content = removePrint(content);
        content = removeQuit(content);
        content = removeRecover(content);
        content = removeRemark(content);
        content = removeRepfooter(content);
        content = removeRepheader(content);
        content = removeRun(content);
        content = removeSave(content);
        content = removeShow(content);
        content = removeShutdown(content);
        content = removeSpool(content);
        content = removeStart(content);
        content = removeStartup(content);
        content = removeStore(content);
        content = removeTiming(content);
        content = removeTtitle(content);
        content = removeUndefined(content);
        content = removeVariable(content);
        
        return content;
    }
    
    private static String removeSet(String content){
        return removeContentStartingWith(content, "set ");
    }
    
    private static String removeWhenever(String content){
        return removeContentStartingWith(content, "whenever");
    }
    
    private static String removeComment(String content){
        return removeContentStartingWith(content, "--");
    }
    
    private static String removePrompt(String content){
        return removeContentStartingWith(content, "prompt");
    }
    
    private static String removeAt(String content){
        return removeContentStartingWith(content, "@");
    }
    
    private static String removeAccept(String content){
        return removeContentStartingWith(content, "accept");
    }
    
    private static String removeAppend(String content){
        return removeContentStartingWith(content, "append");
    }
    
    private static String removeArchive(String content){
        return removeContentStartingWith(content, "archive");
    }
    
    private static String removeAttribute(String content){
        return removeContentStartingWith(content, "attribute");
    }
    
    private static String removeBreak(String content){
        return removeContentStartingWith(content, "break");
    }
    
    private static String removeBtitle(String content){
        return removeContentStartingWith(content, "btitle");
    }
    
    private static String removeChange(String content){
        return removeContentStartingWith(content, "change");
    }
    
    private static String removeClear(String content){
        return removeContentStartingWith(content, "clear");
    }
    
    private static String removeColumn(String content){
        return removeContentStartingWith(content, "column");
    }
    
    private static String removeCompute(String content){
        return removeContentStartingWith(content, "compute");
    }
    
    private static String removeConnect(String content){
        return removeContentStartingWith(content, "connect");
    }
    
    private static String removeCopy(String content){
        return removeContentStartingWith(content, "copy");
    }
    
    private static String removeDefine(String content){
        return removeContentStartingWith(content, "define");
    }
    
    private static String removeDel(String content){
        return removeContentStartingWith(content, "del");
    }
    
    private static String removeDescribe(String content){
        return removeContentStartingWith(content, "describe");
    }
    
    private static String removeDisconnect(String content){
        return removeContentStartingWith(content, "disconnect");
    }
    
    private static String removeEdit(String content){
        return removeContentStartingWith(content, "edit");
    }
    
    private static String removeExecute(String content){
        return removeContentStartingWith(content, "execute");
    }
    
    private static String removeExit(String content){
        return removeContentStartingWith(content, "exit");
    }
    
    private static String removeGet(String content){
        return removeContentStartingWith(content, "get");
    }
    
    private static String removeHelp(String content){
        return removeContentStartingWith(content, "help");
    }
    
    private static String removeHost(String content){
        return removeContentStartingWith(content, "host");
    }
    
    private static String removeInput(String content){
        return removeContentStartingWith(content, "input");
    }
    
    private static String removeList(String content){
        return removeContentStartingWith(content, "list");
    }
    
    private static String removePassword(String content){
        return removeContentStartingWith(content, "password");
    }
    
    private static String removePause(String content){
        return removeContentStartingWith(content, "pause");
    }
    
    private static String removePrint(String content){
        return removeContentStartingWith(content, "print");
    }
    
    private static String removeQuit(String content){
        return removeContentStartingWith(content, "quit");
    }
    
    private static String removeRecover(String content){
        return removeContentStartingWith(content, "recover");
    }
    
    private static String removeRemark(String content){
        return removeContentStartingWith(content, "remark");
    }
    
    private static String removeRepfooter(String content){
        return removeContentStartingWith(content, "repfooter");
    }
    
    private static String removeRepheader(String content){
        return removeContentStartingWith(content, "repheader");
    }
    
    private static String removeRun(String content){
        return removeContentStartingWith(content, "run");
    }
    
    private static String removeSave(String content){
        return removeContentStartingWith(content, "save");
    }
    
    private static String removeShow(String content){
        return removeContentStartingWith(content, "show");
    }
    
    private static String removeShutdown(String content){
        return removeContentStartingWith(content, "shutdown");
    }
    
    private static String removeSpool(String content){
        return removeContentStartingWith(content, "spool");
    }
    
    private static String removeStart(String content){
        return removeContentStartingWith(content, "start");
    }
    
    private static String removeStartup(String content){
        return removeContentStartingWith(content, "startup");
    }
    
    private static String removeStore(String content){
        return removeContentStartingWith(content, "store");
    }
    
    private static String removeTiming(String content){
        return removeContentStartingWith(content, "timing");
    }
    
    private static String removeTtitle(String content){
        return removeContentStartingWith(content, "ttitle");
    }
    
    private static String removeUndefined(String content){
        return removeContentStartingWith(content, "undefined");
    }
    
    private static String removeVariable(String content){
        return removeContentStartingWith(content, "variable");
    }
    
    private static String removeContentStartingWith(String Content, String startWith){
        String replacedContent = Content.replaceAll("(?m)^" + startWith + ".*", "");
        replacedContent = replacedContent.replaceAll("(?m)^" + startWith.toUpperCase()+ ".*", "");
        
        return replacedContent;
    }
}
