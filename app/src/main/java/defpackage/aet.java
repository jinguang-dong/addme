package defpackage;

import android.hardware.camera2.CameraManager;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import j$.util.OptionalInt;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aet implements uif {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aet(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [chq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r12v42, types: [bfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v44, types: [dkf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v54, types: [cnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v61, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [bfs, java.lang.Object] */
    @Override // defpackage.uif
    public final Object a() throws NoSuchMethodException, SecurityException {
        Object obj;
        int iBk;
        List list;
        bhz bhzVar = null;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        switch (this.c) {
            case 0:
                aeu aeuVar = (aeu) this.a;
                blp blpVar = aeuVar.b;
                ?? r12 = this.b;
                bvo bvoVar = (bvo) r12;
                aeuVar.c = blpVar.a(bvoVar.m(), bvoVar.n(), r12);
                return ufg.a;
            case 1:
                ((CameraManager) this.a).unregisterAvailabilityCallback((CameraManager.AvailabilityCallback) this.b);
                return ufg.a;
            case 2:
                ((uka) this.b).a = bko.H(this.a, btc.a);
                return ufg.a;
            case 3:
                Object obj2 = this.b;
                Object obj3 = this.a;
                if (obj3 != null) {
                    aqp aqpVar = (aqp) obj3;
                    bgz bgzVar = aqpVar.c;
                    if (bgzVar.isEmpty()) {
                        obj = aqpVar.b;
                    } else {
                        cpq cpqVar = new cpq(aqpVar.b);
                        int iA = bgzVar.a();
                        for (int i3 = 0; i3 < iA; i3++) {
                            ((uiq) bgzVar.get(i3)).a(cpqVar);
                        }
                        obj = cpqVar.b;
                    }
                    aqpVar.b = (ccm) obj;
                    if (obj != null) {
                        return obj;
                    }
                }
                return obj2;
            case 4:
                int i4 = asi.a;
                return new ejs((ask) this.a);
            case 5:
                Object obj4 = this.b;
                rmr rmrVar = (rmr) this.a;
                if (!a.ao(obj4, rmrVar.b)) {
                    ?? r1 = rmrVar.c;
                    asj asjVar = new asj(obj4, 3);
                    int iBk2 = ske.bk(r1);
                    if (iBk2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            Object obj5 = r1.get(i);
                            if (!((Boolean) asjVar.a(obj5)).booleanValue()) {
                                if (i5 != i) {
                                    r1.set(i5, obj5);
                                }
                                i5++;
                            }
                            if (i != iBk2) {
                                i++;
                            } else {
                                i2 = i5;
                            }
                        }
                    }
                    if (i2 < r1.size() && i2 <= (iBk = ske.bk(r1))) {
                        while (true) {
                            r1.remove(iBk);
                            if (iBk != i2) {
                                iBk--;
                            }
                        }
                    }
                    Object obj6 = rmrVar.a;
                    if (obj6 != null) {
                        ((bai) obj6).a();
                    }
                }
                return ufg.a;
            case 6:
                this.b.j(this.a);
                return ufg.a;
            case 7:
                azq azqVar = (azq) this.b;
                ((ayg) this.a).al(azqVar.a, azqVar.h, azqVar.b);
                return ufg.a;
            case 8:
                ayg aygVar = ((bhv) this.a).b;
                if (!aygVar.m) {
                    return ufw.a;
                }
                Object obj7 = this.b;
                baw bawVar = aygVar.c;
                asj asjVar2 = new asj(obj7, 4);
                bav bavVarB = bawVar.b();
                try {
                    ujy ujyVar = new ujy();
                    while (true) {
                        int i6 = ujyVar.a;
                        if (i6 >= bawVar.b) {
                            break;
                        } else if (bavVarB.B(i6) && ((Boolean) asjVar2.a(bavVarB.o(ujyVar.a))).booleanValue()) {
                            bhz bhzVar2 = new bhz(ujyVar.a, null);
                            bavVarB.r();
                            bhzVar = bhzVar2;
                        } else {
                            int i7 = ujyVar.a;
                            int[] iArr = bavVarB.b;
                            int iE = bay.e(iArr, i7);
                            int i8 = i7 + 1;
                            int i9 = (i8 < bavVarB.c ? iArr[(i8 * 5) + 4] : bavVarB.d) - iE;
                            for (int i10 = 0; i10 < i9; i10++) {
                                if (((Boolean) asjVar2.a(bavVarB.l(ujyVar.a, i10))).booleanValue()) {
                                    bhzVar = new bhz(ujyVar.a, Integer.valueOf(i10));
                                    break;
                                }
                            }
                            ujyVar.a++;
                        }
                    }
                    if (bhzVar == null) {
                        return ufw.a;
                    }
                    boolean z4 = aygVar.m;
                    int i11 = bhzVar.a;
                    Integer num = bhzVar.b;
                    if (z4) {
                        bav bavVarB2 = bawVar.b();
                        try {
                            List listK = bad.k(bavVarB2, i11, num);
                            bavVarB2.r();
                            list = listK;
                        } finally {
                        }
                    } else {
                        list = ufw.a;
                    }
                    return ske.bJ(list, aygVar.T());
                } finally {
                }
            case 9:
                bbd bbdVar = (bbd) this.a;
                bbdVar.h((bbdVar.e() + 1) % ((Object[]) this.b).length);
                return ufg.a;
            case 10:
                return ((dme) this.a).j.d(this.b);
            case 11:
                return new dnb(this.b, ufx.a, this.a);
            case 12:
                if (!a.p(((dqq) ((tdy) ((kwp) this.b).a).a.a()).a, 1) && this.a.e()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 13:
                ((bbf) this.a).h(((Number) chx.t(this.b).a()).longValue());
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Method method = this.b.getClass().getMethod("getWindowAreaComponent", null);
                method.getClass();
                if (coh.f(method) && coh.e(method, ((ebn) this.a).a())) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 15:
                ((dux) this.b).a.b(this.a);
                return ufg.a;
            case 16:
                Method method2 = (Method) this.b;
                String name = method2.getName();
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Method method3 = ((Class) this.a).getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                method3.getClass();
                if (coh.f(method3)) {
                    Class<?> returnType = method2.getReturnType();
                    returnType.getClass();
                    if (coh.e(method3, returnType)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                gwv gwvVar = (gwv) this.b;
                gwvVar.M.a();
                this.a.b(Float.valueOf(0.0f));
                gwvVar.t.b(true);
                return ufg.a;
            case 18:
                ShutterButton shutterButton = ((ndh) this.b).a;
                shutterButton.j.a = rwc.i(this.a);
                shutterButton.invalidate();
                return ufg.a;
            case 19:
                ShutterButton shutterButton2 = ((ndh) this.b).a;
                shutterButton2.j.a = rwc.i(this.a);
                shutterButton2.invalidate();
                return ufg.a;
            default:
                ndw ndwVar = (ndw) this.b;
                OptionalInt optionalInt = ndwVar.s;
                ShutterButton shutterButton3 = ((ndh) this.a).a;
                shutterButton3.j.f(optionalInt.orElse(-16777216));
                shutterButton3.j.l(ndwVar.n);
                return ufg.a;
        }
    }

    public /* synthetic */ aet(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
