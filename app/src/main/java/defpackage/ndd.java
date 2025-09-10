package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ndd implements uiq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ndd(int i) {
        this.b = i;
        this.a = "    ";
    }

    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v74, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiq
    public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Object objAM;
        boolean z = true;
        switch (this.b) {
            case 0:
                ((ndh) this.a).a.j.s(((Integer) obj).intValue());
                return ufg.a;
            case 1:
                cbn cbnVar = (cbn) obj;
                cbnVar.getClass();
                Object obj2 = this.a;
                if (obj2 != null) {
                    cbw.d(cbnVar, (String) obj2);
                }
                return ufg.a;
            case 2:
                int iFloatValue = (int) ((Float) obj).floatValue();
                int i = ndh.c;
                this.a.a(Integer.valueOf(iFloatValue));
                return ufg.a;
            case 3:
                ((ndh) this.a).a.j.r(((Integer) obj).intValue());
                return ufg.a;
            case 4:
                ((ndh) this.a).a.j.q(((Integer) obj).intValue());
                return ufg.a;
            case 5:
                ((ndh) this.a).a.j.j(((Integer) obj).intValue());
                return ufg.a;
            case 6:
                ((ndh) this.a).a.j.y(((Integer) obj).intValue());
                return ufg.a;
            case 7:
                ((ndh) this.a).a.j.f(((Integer) obj).intValue());
                return ufg.a;
            case 8:
                ((ndh) this.a).a.j.f(((Integer) obj).intValue());
                return ufg.a;
            case 9:
                float fFloatValue = ((Float) obj).floatValue();
                float fM = ukc.m(fFloatValue, 0.0f, 1.0f);
                gox goxVar = (gox) this.a;
                if (goxVar.o() == fM) {
                    z = false;
                } else {
                    goxVar.t(ukc.m(fFloatValue, 0.0f, 1.0f), niz.f);
                }
                return Boolean.valueOf(z);
            case 10:
                bpv bpvVar = (bpv) obj;
                this.a.a(Float.valueOf(Float.intBitsToFloat((int) (akg.w(bpvVar) >> 32))));
                bpvVar.b();
                return ufg.a;
            case 11:
                dlb dlbVar = (dlb) obj;
                dlbVar.getClass();
                dlbVar.a(new bfh(2120669884, true, new amj(this.a, 8)));
                dlbVar.a(nrg.d);
                return ufg.a;
            case 12:
                ptq ptqVar = ptq.a;
                if (((Throwable) obj) instanceof CancellationException) {
                    ((CancellationSignal) this.a).cancel();
                }
                return ufg.a;
            case 13:
                ViewOverlay viewOverlay = (ViewOverlay) obj;
                una unaVar = rfc.a;
                viewOverlay.getClass();
                Object obj3 = this.a;
                if (obj3 != null) {
                    try {
                        objInvoke = ((Method) obj3).invoke(viewOverlay, null);
                    } catch (IllegalAccessException e) {
                        Log.w(rfg.a, "Couldn't access view group overlay", e);
                        return null;
                    } catch (InvocationTargetException e2) {
                        Log.w(rfg.a, "Couldn't access view group overlay", e2);
                        return null;
                    }
                } else {
                    objInvoke = null;
                }
                if (objInvoke instanceof ViewGroup) {
                    return (ViewGroup) objInvoke;
                }
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return obj == this.a ? "(this Collection)" : String.valueOf(obj);
            case 15:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                ufn ufnVar = (ufn) this.a;
                return ufnVar.j(key) + "=" + ufnVar.j(entry.getValue());
            case 16:
                String str = (String) obj;
                str.getClass();
                boolean zR = ujp.r(str);
                Object obj4 = this.a;
                return zR ? str.length() >= ((String) obj4).length() ? str : obj4 : ((String) obj4).concat(str);
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                return ((String) this.a).concat(str2);
            case 18:
                ?? r5 = this.a;
                Throwable th = (Throwable) obj;
                int i2 = uvl.a;
                try {
                    Throwable th2 = (Throwable) r5.a(th);
                    boolean zAo = a.ao(th.getMessage(), th2.getMessage());
                    objAM = th2;
                    if (!zAo) {
                        boolean zAo2 = a.ao(th2.getMessage(), th.toString());
                        objAM = th2;
                        if (!zAo2) {
                            objAM = null;
                        }
                    }
                } catch (Throwable th3) {
                    objAM = rnt.aM(th3);
                }
                return (Throwable) (true != (objAM instanceof uew) ? objAM : null);
            case 19:
                Throwable th4 = (Throwable) obj;
                int i3 = uvl.a;
                Object objNewInstance = ((Constructor) this.a).newInstance(th4.getMessage(), th4);
                objNewInstance.getClass();
                return (Throwable) objNewInstance;
            default:
                Throwable th5 = (Throwable) obj;
                int i4 = uvl.a;
                Object objNewInstance2 = ((Constructor) this.a).newInstance(th5.getMessage());
                objNewInstance2.getClass();
                Throwable th6 = (Throwable) objNewInstance2;
                th6.initCause(th5);
                return th6;
        }
    }

    public /* synthetic */ ndd(int i, byte[] bArr) {
        this.b = i;
        this.a = "";
    }

    public /* synthetic */ ndd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
