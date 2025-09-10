package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bu extends br {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final ch e = new ch();

    public bu(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.br
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.br
    public boolean b() {
        throw null;
    }

    public final void h(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, bundle);
    }

    public void e() {
    }
}
