package defpackage;

import android.text.Layout;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdw {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (a.ao(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (a.ao(alignment3.name(), PNlJufQ.KXuA)) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
