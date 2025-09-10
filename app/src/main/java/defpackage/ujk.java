package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ujk {
    public static final void a(Object obj, ArrayList arrayList) {
        Object[] objArr;
        int length;
        if (obj != null && (length = (objArr = (Object[]) obj).length) > 0) {
            arrayList.ensureCapacity(arrayList.size() + length);
            Collections.addAll(arrayList, objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(java.util.Collection r4, defpackage.uhb r5) {
        /*
            boolean r0 = r5 instanceof defpackage.umf
            if (r0 == 0) goto L13
            r0 = r5
            umf r0 = (defpackage.umf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            umf r0 = new umf
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.a
            defpackage.rnt.aN(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.rnt.aN(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            uol r5 = (defpackage.uol) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.m(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            ufg r4 = defpackage.ufg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujk.c(java.util.Collection, uhb):java.lang.Object");
    }

    public static final String d(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final void e(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                f(th, th2);
            }
        }
    }

    public static final void f(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (uhz.cb()) {
                th.addSuppressed(th2);
                return;
            }
            Method method = uhx.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static /* synthetic */ Object g(Object obj) {
        uyz uyzVar = uyz.a;
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        tow towVar = tow.a;
        tra traVar = tra.a;
        tph tphVarQ = tph.q(uyzVar, bArr, 0, length, tow.a);
        tph.D(tphVarQ);
        return (uyz) tphVarQ;
    }

    public static JSONObject h(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalArgumentException(a.bw(str, "Failed adding a default object for key [", "]"), e);
        }
    }

    public static /* synthetic */ String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "OK" : "NEEDS_MORE_OUTPUT" : "NEEDS_MORE_INPUT" : "DONE" : "ERROR";
    }

    public static final int j(vao vaoVar, int i) {
        int i2;
        int length = vaoVar.e.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= length) {
                int i4 = i + 1;
                i2 = (i3 + length) >>> 1;
                int i5 = vaoVar.f[i2];
                if (i5 >= i4) {
                    if (i5 <= i4) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i3 = i2 + 1;
                }
            } else {
                i2 = (-i3) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static int k(int i) {
        if (i == 99) {
            return 100;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            default:
                return 0;
        }
    }

    public static final uwi l(uiq uiqVar, Object obj, uwi uwiVar) {
        try {
            uiqVar.a(obj);
            return uwiVar;
        } catch (Throwable th) {
            if (uwiVar == null || uwiVar.getCause() == th) {
                Objects.toString(obj);
                return new uwi("Exception in undelivered element handler for ".concat(String.valueOf(obj)), th);
            }
            f(uwiVar, th);
            return uwiVar;
        }
    }

    public static final void m(uiq uiqVar, Object obj, uhf uhfVar) {
        uwi uwiVarL = l(uiqVar, obj, null);
        if (uwiVarL != null) {
            ujo.d(uhfVar, uwiVarL);
        }
    }

    public static final void o(uhf uhfVar, Throwable th) {
        Iterator it = uvd.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(uhfVar, th);
            } catch (uvi unused) {
                return;
            } catch (Throwable th2) {
                uvd.a(ujo.c(th, th2));
            }
        }
        try {
            f(th, new uvf(uhfVar));
        } catch (Throwable unused2) {
        }
        uvd.a(th);
    }

    public static final Object p(uhf uhfVar, Object obj, Object obj2, uiu uiuVar, uhb uhbVar) {
        Object objA;
        Object objB = uwe.b(uhfVar, obj2);
        try {
            uur uurVar = new uur(uhbVar, uhfVar);
            if (uiuVar instanceof uhn) {
                ukc.e(uiuVar, 2);
                objA = uiuVar.a(obj, uurVar);
            } else {
                objA = ske.aC(uiuVar, obj, uurVar);
            }
            uwe.c(uhfVar, objB);
            if (objA == uhi.a) {
                uhbVar.getClass();
            }
            return objA;
        } catch (Throwable th) {
            uwe.c(uhfVar, objB);
            throw th;
        }
    }

    public static /* synthetic */ int q(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
