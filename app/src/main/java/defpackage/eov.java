package defpackage;

import android.os.flagging.AconfigPackage;
import android.util.Log;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eov {
    public static volatile boolean a;
    public static boolean b;

    public static final void a() {
        try {
            b = AconfigPackage.load("com.android.settingslib.widget.theme.flags").getBooleanFlagValue(clFzVRcygwbq.tigfO, false);
        } catch (Exception e) {
            Log.e("ExportedFlags", e.toString());
        } catch (LinkageError e2) {
            Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
