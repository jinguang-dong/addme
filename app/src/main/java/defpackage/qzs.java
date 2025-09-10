package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzs {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final tag b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public qzs(Context context, qzt qztVar) {
        this.a = qztVar.c ? qxc.b(context, qztVar.b) : qztVar.b;
        tag tagVarB = tag.b(qztVar.d);
        this.b = tagVarB == null ? tag.UNKNOWN : tagVarB;
        this.c = qztVar.g;
        this.d = qztVar.e;
        this.e = qztVar.f;
    }

    public static Map a(Context context) {
        Map mapB;
        Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapB = g;
            if (mapB == null) {
                sbr sbrVar = new sbr();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open(mn.g(str, "phenotype/"));
                                    try {
                                        tow towVar = tow.a;
                                        tra traVar = tra.a;
                                        tow towVar2 = tow.a;
                                        qzt qztVar = qzt.a;
                                        ton tonVarK = ton.K(inputStreamOpen);
                                        tph tphVarO = qztVar.o();
                                        try {
                                            try {
                                                try {
                                                    trg trgVarB = tra.a.b(tphVarO);
                                                    trgVarB.l(tphVarO, too.p(tonVarK), towVar2);
                                                    trgVarB.g(tphVarO);
                                                    tph.D(tphVarO);
                                                    qzs qzsVar = new qzs(context, (qzt) tphVarO);
                                                    sbrVar.f(qzsVar.a, qzsVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (tpz e) {
                                                    if (e.a) {
                                                        throw new tpz(e);
                                                    }
                                                    throw e;
                                                } catch (tro e2) {
                                                    throw e2.a();
                                                }
                                            } catch (RuntimeException e3) {
                                                if (e3.getCause() instanceof tpz) {
                                                    throw ((tpz) e3.getCause());
                                                }
                                                throw e3;
                                            }
                                        } catch (IOException e4) {
                                            if (e4.getCause() instanceof tpz) {
                                                throw ((tpz) e4.getCause());
                                            }
                                            throw new tpz(e4);
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (tpz e5) {
                                    Log.e("PackageInfo", mn.g(str, "Unable to read Phenotype PackageMetadata for "), e5);
                                }
                            }
                        }
                    }
                } catch (IOException e6) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e6);
                }
                mapB = sbrVar.b();
                g = mapB;
            }
        }
        return mapB;
    }
}
