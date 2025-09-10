package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class reh {
    public final Context a;
    public final Executor b;
    public final String c;
    public final rww d;
    public SharedPreferences e;
    public final AmbientModeSupport.AmbientController f;

    public reh(ref refVar) {
        this.a = refVar.a;
        this.b = refVar.b;
        this.c = refVar.c;
        this.f = refVar.e;
        this.d = refVar.d;
    }

    public static ref a(Context context, Executor executor) {
        return new ref(context.getApplicationContext(), executor);
    }
}
