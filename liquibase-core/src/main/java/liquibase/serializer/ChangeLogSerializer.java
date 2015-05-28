package liquibase.serializer;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import liquibase.changelog.ChangeLogChild;
import liquibase.changelog.ChangeSet;

public interface ChangeLogSerializer extends LiquibaseSerializer {

    <T extends ChangeLogChild> void write(List<T> children, OutputStream out) throws IOException;

    void append(ChangeSet changeSet, File changeLogFile) throws IOException;
}
