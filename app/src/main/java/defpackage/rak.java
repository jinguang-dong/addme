package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rak {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final rww d;
    public final rww e;
    public final rww f;
    public final rww g;
    public final rww h;
    public final Uri i;
    public volatile qym j;
    public final Uri k;
    public volatile qyn l;

    public rak(Context context, rww rwwVar, rww rwwVar2, rww rwwVar3) {
        this.c = context;
        this.e = rwwVar;
        this.d = rwwVar3;
        this.f = rwwVar2;
        Pattern pattern = rcl.a;
        rck rckVar = new rck(context);
        rckVar.d("phenotype_storage_info");
        rckVar.e("storage-info.pb");
        this.i = rckVar.a();
        rck rckVar2 = new rck(context);
        rckVar2.d("phenotype_storage_info");
        rckVar2.e("device-encrypted-storage-info.pb");
        int i = prt.a;
        rckVar2.c();
        this.k = rckVar2.a();
        this.g = rnt.y(new qxi(this, 2));
        this.h = rnt.y(new qxi(rwwVar, 3));
    }

    public final qym a() {
        qym qymVar;
        qym qymVar2 = this.j;
        if (qymVar2 != null) {
            return qymVar2;
        }
        synchronized (a) {
            qymVar = this.j;
            if (qymVar == null) {
                qymVar = qym.b;
                if (prt.g(this.c)) {
                    rdm rdmVarB = rdm.b(qymVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        qym qymVar3 = (qym) ((lat) this.f.fr()).m(this.i, rdmVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        qymVar = qymVar3;
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                    this.j = qymVar;
                }
            }
        }
        return qymVar;
    }

    public final rac b(boolean z) {
        sbp sbpVarJ;
        toj tojVar;
        String str;
        sbp sbpVarJ2;
        sbp sbpVarJ3;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2 = "";
        if (z) {
            qyn qynVar = this.l;
            if (qynVar == null) {
                synchronized (b) {
                    qynVar = this.l;
                    if (qynVar == null) {
                        qynVar = qyn.b;
                        rdm rdmVarB = rdm.b(qynVar);
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            qyn qynVar2 = (qyn) ((lat) this.f.fr()).m(this.k, rdmVarB);
                            StrictMode.setThreadPolicy(threadPolicy);
                            qynVar = qynVar2;
                        } catch (IOException unused) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                        this.l = qynVar;
                    }
                }
            }
            boolean z5 = qynVar.e;
            sbpVarJ = sbp.j(new tpp(qynVar.i, qyn.a));
            tojVar = qynVar.d;
            str = qynVar.f;
            sbpVarJ2 = sbp.j(qynVar.g);
            sbpVarJ3 = sbp.j(qynVar.h);
            if ((qynVar.c & 8) != 0) {
                qyo qyoVar = qynVar.j;
                if (qyoVar == null) {
                    qyoVar = qyo.a;
                }
                if (qyoVar.c == Build.VERSION.SDK_INT) {
                    qyo qyoVar2 = qynVar.j;
                    if (qyoVar2 == null) {
                        qyoVar2 = qyo.a;
                    }
                    str2 = qyoVar2.b;
                }
            }
            i = qynVar.c & 1;
            z2 = qynVar.l;
            z4 = z5;
            z3 = qynVar.k;
        } else {
            qym qymVarA = a();
            boolean z6 = qymVarA.e;
            sbpVarJ = sbp.j(new tpp(qymVarA.j, qym.a));
            tojVar = qymVarA.d;
            str = qymVarA.f;
            sbpVarJ2 = sbp.j(qymVarA.h);
            sbpVarJ3 = sbp.j(qymVarA.i);
            if ((qymVarA.c & 16) != 0) {
                qyo qyoVar3 = qymVarA.k;
                if (qyoVar3 == null) {
                    qyoVar3 = qyo.a;
                }
                if (qyoVar3.c == Build.VERSION.SDK_INT) {
                    qyo qyoVar4 = qymVarA.k;
                    if (qyoVar4 == null) {
                        qyoVar4 = qyo.a;
                    }
                    str2 = qyoVar4.b;
                }
            }
            i = qymVarA.c & 1;
            z2 = qymVarA.m;
            z3 = qymVarA.l;
            z4 = z6;
        }
        return new rac(z4, sbpVarJ, tojVar, str, str2, sbpVarJ2, sbpVarJ3, 1 == i, z2, z3);
    }
}
