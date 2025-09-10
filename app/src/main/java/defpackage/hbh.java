package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import j$.util.Optional;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hbh {
    public static final sgv a = sgv.g("hbh");
    public final hbe b;
    public final SharedPreferences c;
    public final Set d;
    private final Optional e;
    private final qpf f;

    public hbh(qpf qpfVar, SharedPreferences sharedPreferences, hbe hbeVar, hbc hbcVar) throws Throwable {
        Optional optionalEmpty;
        InputStreamReader inputStreamReader;
        this.b = hbeVar;
        this.f = qpfVar;
        this.c = sharedPreferences;
        if (hbcVar.b(hbc.FISHFOOD)) {
            hbk hbkVar = hbk.a;
            InputStreamReader inputStreamReader2 = null;
            kgg kggVar = new kgg(null);
            hbk hbkVar2 = hbk.a;
            kggVar.a = hbkVar2.a();
            boolean z = false;
            if (hbkVar2.a()) {
                try {
                    try {
                        inputStreamReader = new InputStreamReader(new FileInputStream(hbkVar2.b));
                    } catch (FileNotFoundException unused) {
                    } catch (IOException unused2) {
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                    } catch (FileNotFoundException unused3) {
                        inputStreamReader2 = inputStreamReader;
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                        z = true;
                        kggVar.b = z;
                        optionalEmpty = Optional.of(kggVar);
                        this.e = optionalEmpty;
                        this.d = new HashSet();
                    } catch (IOException unused4) {
                        inputStreamReader2 = inputStreamReader;
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                        kggVar.b = z;
                        optionalEmpty = Optional.of(kggVar);
                        this.e = optionalEmpty;
                        this.d = new HashSet();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader2 = inputStreamReader;
                        if (inputStreamReader2 != null) {
                            try {
                                inputStreamReader2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                    if (((char) inputStreamReader.read()) == '1') {
                        inputStreamReader.close();
                        z = true;
                    } else {
                        inputStreamReader.close();
                    }
                } catch (IOException unused6) {
                }
            }
            kggVar.b = z;
            optionalEmpty = Optional.of(kggVar);
        } else {
            optionalEmpty = Optional.empty();
        }
        this.e = optionalEmpty;
        this.d = new HashSet();
    }

    static qxt a(gzg gzgVar, Float f) {
        String str = gzgVar.b;
        if (str == null || f == null) {
            return null;
        }
        double dFloatValue = f.floatValue();
        Double dValueOf = Double.valueOf(dFloatValue);
        String str2 = gzgVar.a;
        qxr qxrVar = hbg.a;
        String str3 = str + "__" + str2;
        dValueOf.getClass();
        Double dValueOf2 = Double.valueOf(dFloatValue);
        int i = qxt.d;
        return new qxm(qxrVar, str3, dValueOf2, false);
    }

    static qxt c(gzg gzgVar, String str) {
        String str2 = gzgVar.b;
        if (str2 == null || str == null) {
            return null;
        }
        String str3 = gzgVar.a;
        qxr qxrVar = hbg.a;
        String str4 = str2 + "__" + str3;
        int i = qxt.d;
        return new qxn(qxrVar, str4, str, false);
    }

    static qxt d(gzg gzgVar, boolean z) {
        String str = gzgVar.b;
        if (str == null) {
            return null;
        }
        String str2 = gzgVar.a;
        return hbg.a.d(str + "__" + str2, z);
    }

    static boolean g(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        qpf qpfVar = this.f;
        String strD = qpfVar.d(str);
        if (strD != null) {
            return strD;
        }
        Optional optional = this.e;
        if (optional.isPresent() && ((kgg) optional.get()).a && ((kgg) optional.get()).b) {
            return null;
        }
        return qpfVar.d("persist.".concat(str));
    }

    public final void f(gzg gzgVar) {
        if (gzgVar.a() || gzgVar.c) {
            this.d.add(gzgVar.a);
        }
    }

    static qxt b(gzg gzgVar, Integer num) {
        String str = gzgVar.b;
        if (str == null || num == null) {
            return null;
        }
        String str2 = gzgVar.a;
        qxr qxrVar = hbg.a;
        String str3 = str + KsvNaXS.DFSeJzvzn + str2;
        num.intValue();
        int i = qxt.d;
        return new qxk(qxrVar, str3, num);
    }
}
