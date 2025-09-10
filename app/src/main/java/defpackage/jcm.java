package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import android.os.Trace;
import com.google.ar.core.R;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jcm extends fqf implements msk {
    public static final sgv a = sgv.g("jcm");
    private final jcd A;
    private final kgt B;
    private jtg C;
    private final mqb D;
    private final mft E;
    private final mdm F;
    private final lsp G;
    private final jid H;
    private final juh I;
    private final fee J;
    private final Supplier K;
    private final lst L;
    private final kgp M;
    private final gsn N;
    private final tdy O;
    public final ndo b;
    public final owq c;
    public final out d;
    public final mrx e;
    public final fbq f;
    public final gnt g;
    public final moy h;
    public final rwc i;
    public szh j;
    public final jcc k;
    public our l;
    public final owq m;
    public final mbj n;
    public final ktx o;
    public jth p;
    public final uh q;
    public final qwz r;
    public final qqq s;
    private final ndj v;
    private final itl w;
    private final itk x;
    private final Context y;
    private final Resources z;

    public jcm(out outVar, ktx ktxVar, gnt gntVar, kgp kgpVar, kgt kgtVar, rwc rwcVar, Resources resources, fvu fvuVar, ndj ndjVar, itl itlVar, mbj mbjVar, owq owqVar, jcd jcdVar, moy moyVar, mrx mrxVar, mqb mqbVar, ocq ocqVar, mdm mdmVar, lsp lspVar, uem uemVar, fbq fbqVar, cxb cxbVar, Context context, jcc jccVar, qqq qqqVar, uh uhVar, tdy tdyVar, juh juhVar, owq owqVar2, qwz qwzVar, fee feeVar, Supplier supplier) {
        jcg jcgVar = new jcg(this);
        this.N = jcgVar;
        this.b = new jch(this);
        this.x = new jci(this, 0);
        this.L = new jcl(this);
        this.d = outVar;
        this.o = ktxVar;
        this.c = owqVar;
        this.D = mqbVar;
        this.n = mbjVar;
        this.y = context;
        this.z = resources;
        this.g = gntVar;
        this.M = kgpVar;
        this.B = kgtVar;
        this.i = rwcVar;
        this.v = ndjVar;
        this.w = itlVar;
        this.A = jcdVar;
        this.h = moyVar;
        this.e = mrxVar;
        this.F = mdmVar;
        this.G = lspVar;
        this.k = jccVar;
        this.f = fbqVar;
        this.s = qqqVar;
        this.q = uhVar;
        this.O = tdyVar;
        this.I = juhVar;
        this.m = owqVar2;
        this.r = qwzVar;
        this.J = feeVar;
        this.K = supplier;
        if (cxbVar.g().getBooleanExtra("include_location_in_exif", false)) {
            this.H = (jid) uemVar.a();
        } else {
            this.H = new jij();
        }
        szh szhVar = new szh();
        this.j = szhVar;
        szhVar.a(new IllegalStateException("No image has been captured"));
        this.E = ocqVar.ag(new mfs(new File(String.valueOf(context.getExternalCacheDir()) + File.separator + "ImageIntent")));
        fvuVar.A(jcgVar);
    }

    @Override // defpackage.fqf
    public final boolean A() {
        return true;
    }

    @Override // defpackage.fqf
    public final rwc a() {
        return rwc.i(this.p);
    }

    @Override // defpackage.msk
    public final void b() {
        this.n.d(R.raw.timer_start);
        this.D.d();
    }

    @Override // defpackage.msk
    public final void c(int i) {
        if (i == 1) {
            this.n.d(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.n.d(R.raw.timer_increment);
        }
    }

    public final synchronized void d() {
        try {
            byte[] bArr = (byte[]) this.j.s();
            bArr.getClass();
            jcd jcdVar = this.A;
            rwc rwcVar = jcdVar.d;
            char[] cArr = null;
            if (rwcVar.h()) {
                Uri uri = (Uri) rwcVar.c();
                ske.W(ske.P(new gdq((Object) jcdVar, (Object) uri, (Object) bArr, 14, (char[]) null), jcdVar.e), new iiz(jcdVar, uri, 6, null), jcdVar.c);
                return;
            }
            Trace.beginSection("ImageIntent:CompressingImageIntoIntentExtra");
            Bitmap bitmapA = nmo.a(bArr);
            bitmapA.getClass();
            Trace.endSection();
            jcdVar.c.execute(new imf(jcdVar, new Intent("inline-data").putExtra("data", bitmapA), 16, cArr));
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Couldn't get image data from Future", e);
        }
    }

    public final boolean e() {
        jcc jccVar = this.k;
        if (!jccVar.c()) {
            return false;
        }
        out.a();
        jccVar.b.a();
        this.D.e();
        return true;
    }

    @Override // defpackage.fqf
    protected final void eA() {
        e();
    }

    @Override // defpackage.fqf
    public final void eB() {
        jth jthVar = this.p;
        if (jthVar != null) {
            jthVar.close();
        }
        this.p = null;
        jtg jtgVar = this.C;
        if (jtgVar != null) {
            jtgVar.cancel(true);
            this.C = null;
        }
        this.s.g();
        jtg jtgVarA = this.M.a(this.g, this.B, nkw.IMAGE_INTENT);
        this.C = jtgVarA;
        if (jtgVarA != null) {
            ske.W(jtgVarA, new fxw(this, 5), this.d);
        }
    }

    @Override // defpackage.fqf
    protected final void eC() {
        rwc rwcVar = this.A.d;
        if (rwcVar.h()) {
            Context context = this.y;
            Uri uri = (Uri) rwcVar.c();
            int i = fdo.a;
            if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 2) != 0) {
                tdy tdyVar = this.O;
                ((out) tdyVar.a).c(new dzd(tdyVar, 18));
                return;
            }
        }
        this.q.j();
    }

    @Override // defpackage.msk
    public final void ev(boolean z) {
        this.D.e();
        n();
    }

    @Override // defpackage.fqf
    protected final void l() {
        this.G.a(this.L);
        this.l = new our();
        this.k.a(false);
        this.w.b(this.x);
        ndj ndjVar = this.v;
        this.l.d(ndjVar.e(this.b));
        our ourVar = this.l;
        ndjVar.getClass();
        ourVar.d(this.c.dK(new jbp(ndjVar, 5), this.d));
        this.l.d(this.g.dK(new jbp(this, 6), sxo.a));
        this.I.b(this, nkw.IMAGE_INTENT, this.l);
        this.C.getClass();
    }

    @Override // defpackage.fqf
    protected final void m() {
        this.G.i(this.L);
        jtg jtgVar = this.C;
        if (jtgVar != null) {
            jtgVar.cancel(true);
            this.C = null;
        }
        this.s.g();
        this.l.close();
    }

    @Override // defpackage.fqf
    public final synchronized void n() {
        ((sgt) a.c().M(2655)).s("takePictureInvoked");
        jth jthVar = this.p;
        jthVar.getClass();
        mft mftVar = this.E;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = mftVar.a(jCurrentTimeMillis);
        this.j = new szh();
        lrx lrxVar = new lrx(strA, jCurrentTimeMillis, this.H.a(), this.F, this.j, this.J, this.K);
        ovx ovxVar = new ovx(false);
        kfk kfkVarA = kfl.a();
        kfkVarA.b(new jcj(this));
        kfkVarA.e(-1);
        kgw kgwVar = jthVar.c;
        kfkVarA.c(kgwVar.l());
        kfkVarA.a = kgwVar.O();
        kfkVarA.c = ovxVar;
        kfkVarA.d(false);
        kfkVarA.g(false);
        ske.W(jthVar.e(kfkVarA.a(), lrxVar), new jck(this), this.d);
    }

    @Override // defpackage.fqf
    public final boolean o() {
        if (!this.k.f) {
            return e();
        }
        this.N.g();
        return true;
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.z.getString(R.string.photo_accessibility_peek);
    }

    @Override // defpackage.fqf
    public final void E() {
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fqf
    public final void t(ena enaVar) {
    }
}
