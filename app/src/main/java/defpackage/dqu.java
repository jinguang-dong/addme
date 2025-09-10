package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.SharedLibraryVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqu {
    public static final aby a = byi.bg(500, 0, new aci(0.0f, 0.0f, 0.0f, 1.0f), 2);
    public static final float b = 50.0f;
    public static final float c = 3.0f;
    public static final float d = 2.0f;

    public static final dqt a(ayc aycVar) {
        doq doqVarH = SharedLibraryVersion.h(aycVar);
        dqt dqtVar = doqVarH.F;
        if (dqtVar != null) {
            return dqtVar;
        }
        dqt dqtVar2 = new dqt(AmbientMode.AmbientCallback.i(dor.b(doqVarH, 5), 80.0f), AmbientMode.AmbientCallback.i(dor.b(doqVarH, 5), 20.0f));
        doqVarH.F = dqtVar2;
        return dqtVar2;
    }

    public static final float b(ayc aycVar) {
        return ((Configuration) aycVar.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 225 ? 6.0f : 5.0f;
    }
}
