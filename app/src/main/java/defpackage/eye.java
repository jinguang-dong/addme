package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eye implements eqp {
    @Override // defpackage.eqa
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, eqm eqmVar) throws Throwable {
        try {
            fak.c(((eyd) ((esw) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.eqp
    public final int b() {
        return 1;
    }
}
