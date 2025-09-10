package defpackage;

import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nak implements paq {
    private nan a;
    private imi b;
    protected final Context j;
    protected nan k;
    protected boolean l = false;

    public nak(Context context) {
        this.j = context;
    }

    public final synchronized void b() {
        this.l = false;
        f();
    }

    public final synchronized void c(imi imiVar) {
        this.b = imiVar;
        this.l = true;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    public void d() {
        this.a = j(this.j.getString(R.string.cuttlefish_capturing_first), -1, 10);
    }

    public final void f() {
        imi imiVar;
        nan nanVar = this.k;
        if (nanVar == null || (imiVar = this.b) == null) {
            return;
        }
        imiVar.f(nanVar);
        this.k = null;
    }

    public final void g(float f) {
        h(this.a, f);
    }

    public final void h(nan nanVar, float f) {
        if (f == 0.0f) {
            i(nanVar);
        } else if (f == 1.0f) {
            f();
        }
    }

    public final void i(nan nanVar) {
        nan nanVar2;
        if (this.b != null) {
            nan nanVar3 = this.k;
            this.k = nanVar;
            if (nanVar3 != null && !nanVar.equals(nanVar3)) {
                this.b.f(nanVar3);
            }
            synchronized (this) {
                if (this.l && (nanVar2 = this.k) != null) {
                    this.b.a(nanVar2);
                }
            }
        }
    }

    protected final nan j(String str, int i, int i2) {
        nao naoVar = new nao();
        naoVar.e = str;
        naoVar.h = this.j;
        naoVar.j = i2;
        if (i == -1) {
            naoVar.a = true;
        } else {
            naoVar.a = false;
            naoVar.b = i;
        }
        return naoVar.a();
    }
}
