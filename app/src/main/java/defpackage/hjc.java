package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.build.data.JKx.wzgaYJqO;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum hjc {
    UNKNOWN(""),
    NO_OBJECT(CZAHo.wia),
    SINGLE_KEY_SUBJECT("Single key subject"),
    SINGLE_KEY_SUBJECT_WITH_MULTIPLE_OBJECTS("Single key subject with multiple objects"),
    SINGLE_OBJECT("Single object"),
    MULTIPLE_KEY_SUBJECTS(wzgaYJqO.NDhYPTnbnixTg),
    MULTIPLE_KEY_SUBJECTS_WITHOUT_CROPPED("Multiple key subjects without cropped"),
    MULTIPLE_OBJECTS("Multiple objects"),
    MORE_THAN_MAX_OBJECTS("More than max objects"),
    MORE_THAN_MAX_OBJECT_TYPES("More than max object types"),
    AUTO_CAPTURE("Auto capture"),
    CANCEL_COUNTDOWN(YyLACfm.BIwSFZQv),
    IMAGE_CAPTION_USAGE_HINT_TALKBACK("Image caption usage hint talkback"),
    IMAGE_CAPTION_USAGE_HINT_NON_TALKBACK("Image caption usage hint non-talkback"),
    IMAGE_CAPTION_NOT_READY("Image caption not ready"),
    IMAGE_CAPTION_STARTED_NORMAL("Image caption started normal"),
    IMAGE_CAPTION_STARTED_DETAIL("Image caption started detail"),
    IMAGE_CAPTION_PROCESS_FAILED("Image caption process failed"),
    IMAGE_CAPTION_COMPLETED("Image caption completed"),
    IMAGE_CAPTION_CANCELLED("Image caption cancelled");

    public final String u;

    hjc(String str) {
        this.u = str;
    }

    public static hjc a(String str) {
        for (hjc hjcVar : values()) {
            if (hjcVar.u.equals(str)) {
                return hjcVar;
            }
        }
        return UNKNOWN;
    }
}
