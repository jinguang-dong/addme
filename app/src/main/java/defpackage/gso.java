package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.ar.core.R;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gso implements lzh, lyt, gqa {
    public final our a;
    public lzm b;
    public rwc c;
    public rwc d;
    public final lyu e;
    public final gre f;
    public final gsz g;
    public final gqc h;
    public final cxb i;
    public final qqq j;
    private final Executor k;
    private final syu l;
    private final Context m;
    private final AtomicBoolean n;
    private final hbj o;

    public gso(gqc gqcVar, pbs pbsVar, lyu lyuVar, hbj hbjVar, cxb cxbVar, gre greVar, qqq qqqVar, gsz gszVar, Context context, syu syuVar) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.d = rvkVar;
        this.n = new AtomicBoolean(false);
        this.h = gqcVar;
        this.k = pbsVar;
        this.e = lyuVar;
        this.o = hbjVar;
        this.i = cxbVar;
        this.f = greVar;
        this.j = qqqVar;
        this.g = gszVar;
        this.l = syuVar;
        this.a = new our();
        this.m = context;
    }

    private final void i(gpr gprVar) {
        String str = gprVar.b;
        lzk lzkVarA = lzl.a();
        byte[] bArr = null;
        if (str != null) {
            lzkVarA.a = str;
            int i = gprVar.l;
            if (i == 0) {
                throw null;
            }
            if (i == 2 && gprVar.g == 256) {
                lzkVarA.e = String.format(Locale.ROOT, "%s %s", this.m.getString(R.string.qr_code_detected_description), str);
                lzkVarA.d(false);
            }
        }
        Drawable drawable = gprVar.d;
        if (drawable != null) {
            lzkVarA.b = drawable;
        }
        lzkVarA.c = new gbh(this, gprVar, 18, bArr);
        lzkVarA.g = new gbh(this, gprVar, 19, bArr);
        lzkVarA.h = new gbh(this, gprVar, 20, bArr);
        if (this.o.p(gzw.m)) {
            lzkVarA.j = 2;
        }
        lzl lzlVarA = lzkVarA.a();
        if (this.d.h() && ((gpr) this.d.c()).a == gprVar.a && this.c.h() && ((gpr) this.c.c()).a == ((gpr) this.d.c()).a) {
            lzm lzmVar = this.b;
            if (lzmVar != null) {
                lzmVar.c(lzlVarA);
                return;
            }
            return;
        }
        this.d = rwc.j(gprVar);
        lzm lzmVar2 = this.b;
        if (lzmVar2 != null) {
            lzmVar2.a();
            this.b.b(lzlVarA);
        }
    }

    @Override // defpackage.gqa
    public final void a(gqf gqfVar) {
        this.k.execute(new gbh(this, gqfVar, 16, null));
    }

    public final void d(gpr gprVar) {
        int i = gprVar.k;
        if (i != 4) {
            if (gprVar.l != 3) {
                i(gprVar);
                return;
            } else {
                if (i == 3) {
                    i(gprVar);
                    return;
                }
                return;
            }
        }
        if (this.d.h() && ((gpr) this.d.c()).a == gprVar.a) {
            this.d = rvk.a;
            lzm lzmVar = this.b;
            if (lzmVar != null) {
                lzmVar.a();
            }
        }
    }

    @Override // defpackage.lzh
    public final void dM() {
        this.k.execute(new gpk(this.a, 9));
    }

    @Override // defpackage.lyt
    public final void e(pjo pjoVar, mxm mxmVar) {
        nnw nnwVar = new nnw(pjoVar.g(), mxmVar);
        gqg gqgVar = this.h.d.b;
        gqgVar.i = nnwVar;
        gqgVar.f.d = nnwVar;
    }

    @Override // defpackage.lzh
    public final void eZ(lzm lzmVar) {
        this.k.execute(new cmc(this, lzmVar, 12, null));
    }

    @Override // defpackage.lzh
    public final void f() {
        this.g.j();
        this.k.execute(new gpk(this, 10));
    }

    @Override // defpackage.lzh
    public final void fa() {
        this.g.m();
    }

    @Override // defpackage.lyt
    public final void h(poj pojVar) {
        if (!this.n.compareAndSet(false, true)) {
            this.k.execute(new gbh(this, pojVar, 17));
            return;
        }
        gsz gszVar = this.g;
        gszVar.a();
        gszVar.m();
        this.l.c(new cmc(this, pojVar, 11, null), this.k);
    }
}
