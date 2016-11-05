package org.manlier.validation.entities;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * Created by manlier on 2016/10/29.
 */
@GroupSequence({Default.class, GroupA.class, GroupB.class})
public interface Group {
}
