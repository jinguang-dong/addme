package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ofq extends ogh implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    public final odn d;

    public ofq(ogi ogiVar, odn odnVar) {
        super(ogiVar);
        this.b = new AtomicReference(null);
        this.c = new ols(Looper.getMainLooper());
        this.d = odnVar;
    }

    private static final int k(qev qevVar) {
        if (qevVar == null) {
            return -1;
        }
        return qevVar.a;
    }

    public final void a(odj odjVar, int i) {
        this.b.set(null);
        e(odjVar, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.ogh
    public final void c(int i, int i2, Intent intent) {
        qev qevVar = (qev) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int iE = this.d.e(l());
                if (iE == 0) {
                    b();
                    return;
                } else {
                    if (qevVar == null) {
                        return;
                    }
                    if (((odj) qevVar.b).c == 18 && iE == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (qevVar != null) {
                a(new odj(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, ((odj) qevVar.b).toString()), k(qevVar));
                return;
            }
            return;
        }
        if (qevVar != null) {
            a((odj) qevVar.b, qevVar.a);
        }
    }

    @Override // defpackage.ogh
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new qev(new odj(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(odj odjVar, int i);

    protected abstract void f();

    @Override // defpackage.ogh
    public final void g(Bundle bundle) {
        qev qevVar = (qev) this.b.get();
        if (qevVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", qevVar.a);
        odj odjVar = (odj) qevVar.b;
        bundle.putInt("failed_status", odjVar.c);
        bundle.putParcelable("failed_resolution", odjVar.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new odj(13, null), k((qev) this.b.get()));
    }
}
