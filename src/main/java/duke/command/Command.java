package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.tasklist.TaskList;
import duke.ui.Ui;
import java.text.ParseException;

public abstract class Command {

    public abstract String execute(TaskList tasks, Ui ui, Storage storage) throws DukeException, ParseException;

}
