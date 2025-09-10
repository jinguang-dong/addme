package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efm {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};

    public static efy a(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return b(context.getAssets().open(str), str2);
            }
            return e(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new efy((Throwable) e);
        }
    }

    public static efy b(InputStream inputStream, String str) throws IOException {
        try {
            val valVar = new val(vah.a(inputStream));
            String[] strArr = elb.a;
            return k(new elc(valVar), str, true);
        } finally {
            eln.e(inputStream);
        }
    }

    public static efy c(Context context, int i) {
        return d(context, i, i(context, i));
    }

    public static efy d(Context context, int i, String str) {
        try {
            val valVar = new val(vah.a(context.getResources().openRawResource(i)));
            return m(valVar).booleanValue() ? e(context, new ZipInputStream(new vak(valVar)), str) : b(new vak(valVar), str);
        } catch (Resources.NotFoundException e) {
            return new efy((Throwable) e);
        }
    }

    public static ega f(Context context, String str, String str2) {
        return l(str2, new efk((Object) context.getApplicationContext(), str, (Object) str2, 0));
    }

    public static ega g(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: efj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = efm.a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return efm.d(context2, i, str);
            }
        });
    }

    public static ega h(final Context context, final String str, final String str2) {
        return l(str2, new Callable() { // from class: efi
            /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 647
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.efi.call():java.lang.Object");
            }
        });
    }

    public static String i(Context context, int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(i2 != 32 ? "_day_" : "_night_");
        sb.append(i);
        return sb.toString();
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((egb) arrayList.get(i)).a();
        }
    }

    private static efy k(elb elbVar, String str, boolean z) throws IOException {
        efy efyVar;
        zb zbVar;
        ArrayList arrayList;
        HashMap map;
        ArrayList arrayList2;
        aab aabVar;
        float f;
        float f2;
        zb zbVar2;
        ArrayList arrayList3;
        float f3;
        aab aabVar2;
        ArrayList arrayList4;
        try {
            try {
                iso isoVar = ekm.a;
                float fA = eln.a();
                zb zbVar3 = new zb();
                ArrayList arrayList5 = new ArrayList();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                ArrayList arrayList6 = new ArrayList();
                aab aabVar3 = new aab();
                efh efhVar = new efh();
                elbVar.h();
                float fA2 = 0.0f;
                float fA3 = 0.0f;
                float fA4 = 0.0f;
                int iB = 0;
                int iB2 = 0;
                while (elbVar.n()) {
                    float f4 = fA;
                    switch (elbVar.q(ekm.a)) {
                        case 0:
                            ArrayList arrayList7 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList7;
                            map = map4;
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            iB = elbVar.b();
                            zb zbVar4 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar4;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 1:
                            ArrayList arrayList8 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList8;
                            map = map4;
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            iB2 = elbVar.b();
                            zb zbVar42 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar42;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 2:
                            ArrayList arrayList9 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList9;
                            map = map4;
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            fA2 = (float) elbVar.a();
                            zb zbVar422 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar422;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 3:
                            arrayList2 = arrayList6;
                            fA3 = ((float) elbVar.a()) - 0.01f;
                            arrayList5 = arrayList5;
                            zbVar3 = zbVar3;
                            fA = f4;
                            aabVar3 = aabVar3;
                            map4 = map4;
                            fA4 = fA4;
                            break;
                        case 4:
                            arrayList2 = arrayList6;
                            f = fA3;
                            fA4 = (float) elbVar.a();
                            arrayList5 = arrayList5;
                            zbVar3 = zbVar3;
                            fA = f4;
                            aabVar3 = aabVar3;
                            map4 = map4;
                            fA3 = f;
                            break;
                        case 5:
                            ArrayList arrayList10 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList10;
                            map = map4;
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            String[] strArrSplit = elbVar.f().split("\\.");
                            int i = Integer.parseInt(strArrSplit[0]);
                            int i2 = Integer.parseInt(strArrSplit[1]);
                            int i3 = Integer.parseInt(strArrSplit[2]);
                            if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                                efhVar.d("Lottie only supports bodymovin >= 4.4.0");
                            }
                            zb zbVar4222 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar4222;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 6:
                            zb zbVar5 = zbVar3;
                            ArrayList arrayList11 = arrayList5;
                            map = map4;
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            elbVar.g();
                            int i4 = 0;
                            while (elbVar.n()) {
                                ejk ejkVarA = ekl.a(elbVar, efhVar);
                                if (ejkVarA.t == 3) {
                                    i4++;
                                }
                                ArrayList arrayList12 = arrayList11;
                                arrayList12.add(ejkVarA);
                                zb zbVar6 = zbVar5;
                                zbVar6.g(ejkVarA.d, ejkVarA);
                                if (i4 > 4) {
                                    elg.a("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                                }
                                arrayList11 = arrayList12;
                                zbVar5 = zbVar6;
                            }
                            zbVar = zbVar5;
                            arrayList = arrayList11;
                            elbVar.i();
                            zb zbVar42222 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar42222;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 7:
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            elbVar.g();
                            while (elbVar.n()) {
                                ArrayList arrayList13 = new ArrayList();
                                zb zbVar7 = new zb();
                                elbVar.h();
                                HashMap map5 = map4;
                                String strF = null;
                                String strF2 = null;
                                int iB3 = 0;
                                int iB4 = 0;
                                while (elbVar.n()) {
                                    float f5 = fA4;
                                    int iQ = elbVar.q(ekm.b);
                                    if (iQ != 0) {
                                        f3 = fA3;
                                        if (iQ != 1) {
                                            if (iQ == 2) {
                                                iB3 = elbVar.b();
                                            } else if (iQ == 3) {
                                                iB4 = elbVar.b();
                                            } else if (iQ != 4) {
                                                if (iQ != 5) {
                                                    elbVar.l();
                                                    elbVar.m();
                                                } else {
                                                    elbVar.f();
                                                }
                                                zbVar2 = zbVar3;
                                                arrayList3 = arrayList5;
                                            } else {
                                                strF2 = elbVar.f();
                                            }
                                            fA4 = f5;
                                            fA3 = f3;
                                        } else {
                                            elbVar.g();
                                            while (elbVar.n()) {
                                                ejk ejkVarA2 = ekl.a(elbVar, efhVar);
                                                zbVar7.g(ejkVarA2.d, ejkVarA2);
                                                arrayList13.add(ejkVarA2);
                                                zbVar3 = zbVar3;
                                                arrayList5 = arrayList5;
                                            }
                                            zbVar2 = zbVar3;
                                            arrayList3 = arrayList5;
                                            elbVar.i();
                                        }
                                    } else {
                                        zbVar2 = zbVar3;
                                        arrayList3 = arrayList5;
                                        f3 = fA3;
                                        strF = elbVar.f();
                                    }
                                    zbVar3 = zbVar2;
                                    fA4 = f5;
                                    fA3 = f3;
                                    arrayList5 = arrayList3;
                                }
                                zb zbVar8 = zbVar3;
                                ArrayList arrayList14 = arrayList5;
                                float f6 = fA3;
                                float f7 = fA4;
                                elbVar.j();
                                if (strF2 != null) {
                                    eft eftVar = new eft(iB3, iB4, strF, strF2);
                                    map3.put(eftVar.c, eftVar);
                                } else {
                                    map2.put(strF, arrayList13);
                                }
                                zbVar3 = zbVar8;
                                map4 = map5;
                                fA4 = f7;
                                fA3 = f6;
                                arrayList5 = arrayList14;
                            }
                            ArrayList arrayList15 = arrayList5;
                            map = map4;
                            f = fA3;
                            f2 = fA4;
                            elbVar.i();
                            zbVar = zbVar3;
                            arrayList = arrayList15;
                            zb zbVar422222 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar422222;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 8:
                            arrayList2 = arrayList6;
                            elbVar.h();
                            while (elbVar.n()) {
                                if (elbVar.q(ekm.c) != 0) {
                                    elbVar.l();
                                    elbVar.m();
                                } else {
                                    elbVar.g();
                                    while (elbVar.n()) {
                                        iso isoVar2 = eke.a;
                                        elbVar.h();
                                        String strF3 = null;
                                        String strF4 = null;
                                        String strF5 = null;
                                        while (elbVar.n()) {
                                            int iQ2 = elbVar.q(eke.a);
                                            if (iQ2 != 0) {
                                                aabVar2 = aabVar3;
                                                if (iQ2 == 1) {
                                                    strF4 = elbVar.f();
                                                } else if (iQ2 == 2) {
                                                    strF5 = elbVar.f();
                                                } else if (iQ2 != 3) {
                                                    elbVar.l();
                                                    elbVar.m();
                                                } else {
                                                    elbVar.a();
                                                }
                                            } else {
                                                aabVar2 = aabVar3;
                                                strF3 = elbVar.f();
                                            }
                                            aabVar3 = aabVar2;
                                        }
                                        elbVar.j();
                                        ehy ehyVar = new ehy(strF3, strF4, strF5);
                                        map4.put(ehyVar.b, ehyVar);
                                        aabVar3 = aabVar3;
                                    }
                                    elbVar.i();
                                    aabVar3 = aabVar3;
                                }
                            }
                            aabVar = aabVar3;
                            elbVar.j();
                            ArrayList arrayList16 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList16;
                            map = map4;
                            f = fA3;
                            f2 = fA4;
                            zb zbVar4222222 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar4222222;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 9:
                            elbVar.g();
                            while (elbVar.n()) {
                                iso isoVar3 = ekd.a;
                                ArrayList arrayList17 = new ArrayList();
                                elbVar.h();
                                String strF6 = null;
                                String strF7 = null;
                                double dA = 0.0d;
                                char cCharAt = 0;
                                while (elbVar.n()) {
                                    int iQ3 = elbVar.q(ekd.a);
                                    if (iQ3 != 0) {
                                        arrayList4 = arrayList6;
                                        if (iQ3 == 1) {
                                            elbVar.a();
                                        } else if (iQ3 == 2) {
                                            dA = elbVar.a();
                                        } else if (iQ3 == 3) {
                                            strF6 = elbVar.f();
                                        } else if (iQ3 == 4) {
                                            strF7 = elbVar.f();
                                        } else if (iQ3 != 5) {
                                            elbVar.l();
                                            elbVar.m();
                                        } else {
                                            elbVar.h();
                                            while (elbVar.n()) {
                                                if (elbVar.q(ekd.b) != 0) {
                                                    elbVar.l();
                                                    elbVar.m();
                                                } else {
                                                    elbVar.g();
                                                    while (elbVar.n()) {
                                                        arrayList17.add((ejc) ejz.a(elbVar, efhVar));
                                                    }
                                                    elbVar.i();
                                                }
                                            }
                                            elbVar.j();
                                        }
                                    } else {
                                        arrayList4 = arrayList6;
                                        cCharAt = elbVar.f().charAt(0);
                                    }
                                    arrayList6 = arrayList4;
                                }
                                elbVar.j();
                                ehz ehzVar = new ehz(arrayList17, cCharAt, dA, strF6, strF7);
                                aabVar3.f(ehzVar.hashCode(), ehzVar);
                                arrayList6 = arrayList6;
                            }
                            arrayList2 = arrayList6;
                            elbVar.i();
                            ArrayList arrayList18 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList18;
                            map = map4;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            zb zbVar42222222 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar42222222;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 10:
                            elbVar.g();
                            while (elbVar.n()) {
                                elbVar.h();
                                while (elbVar.n()) {
                                    int iQ4 = elbVar.q(ekm.d);
                                    if (iQ4 == 0) {
                                        elbVar.f();
                                    } else if (iQ4 == 1) {
                                        elbVar.a();
                                    } else if (iQ4 != 2) {
                                        elbVar.l();
                                        elbVar.m();
                                    } else {
                                        elbVar.a();
                                    }
                                }
                                elbVar.j();
                                arrayList6.add(new gsn());
                            }
                            elbVar.i();
                            ArrayList arrayList19 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList19;
                            map = map4;
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            zb zbVar422222222 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar422222222;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        default:
                            ArrayList arrayList20 = arrayList5;
                            zbVar = zbVar3;
                            arrayList = arrayList20;
                            map = map4;
                            arrayList2 = arrayList6;
                            aabVar = aabVar3;
                            f = fA3;
                            f2 = fA4;
                            elbVar.l();
                            elbVar.m();
                            zb zbVar4222222222 = zbVar;
                            arrayList5 = arrayList;
                            zbVar3 = zbVar4222222222;
                            fA = f4;
                            aabVar3 = aabVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                    }
                    arrayList6 = arrayList2;
                }
                float f8 = fA;
                efhVar.g = new Rect(0, 0, (int) (iB * f8), (int) (iB2 * f8));
                efhVar.h = fA2;
                efhVar.i = fA3;
                efhVar.j = fA4;
                efhVar.f = arrayList5;
                efhVar.e = zbVar3;
                efhVar.a = map2;
                efhVar.b = map3;
                efhVar.d = aabVar3;
                efhVar.c = map4;
                if (str != null) {
                    eic.a.a(str, efhVar);
                }
                efyVar = new efy(efhVar);
            } catch (Exception e) {
                efyVar = new efy((Throwable) e);
            }
            if (z) {
                eln.e(elbVar);
            }
            return efyVar;
        } catch (Throwable th) {
            if (z) {
                eln.e(elbVar);
            }
            throw th;
        }
    }

    private static ega l(final String str, Callable callable) {
        efh efhVar = str == null ? null : (efh) eic.a.b.a(str);
        if (efhVar != null) {
            return new ega(new dyo(efhVar, 5));
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (ega) map.get(str);
            }
        }
        ega egaVar = new ega(callable);
        if (str != null) {
            final int i = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i2 = 1;
            egaVar.e(new efu() { // from class: efl
                @Override // defpackage.efu
                public final void a(Object obj) {
                    if (i2 != 0) {
                        Map map2 = efm.a;
                        map2.remove(str);
                        atomicBoolean.set(true);
                        if (map2.size() == 0) {
                            efm.j();
                            return;
                        }
                        return;
                    }
                    Map map3 = efm.a;
                    map3.remove(str);
                    atomicBoolean.set(true);
                    if (map3.size() == 0) {
                        efm.j();
                    }
                }
            });
            egaVar.d(new efu() { // from class: efl
                @Override // defpackage.efu
                public final void a(Object obj) {
                    if (i != 0) {
                        Map map2 = efm.a;
                        map2.remove(str);
                        atomicBoolean.set(true);
                        if (map2.size() == 0) {
                            efm.j();
                            return;
                        }
                        return;
                    }
                    Map map3 = efm.a;
                    map3.remove(str);
                    atomicBoolean.set(true);
                    if (map3.size() == 0) {
                        efm.j();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, egaVar);
                if (map2.size() == 1) {
                    j();
                }
            }
        }
        return egaVar;
    }

    private static Boolean m(vae vaeVar) throws EOFException {
        try {
            val valVar = new val(new vaj(vaeVar));
            byte[] bArr = c;
            int length = bArr.length;
            for (int i = 0; i < 4; i++) {
                byte b2 = bArr[i];
                if (!valVar.l(1L)) {
                    throw new EOFException();
                }
                if (valVar.b.b() != b2) {
                    return false;
                }
            }
            valVar.close();
            return true;
        } catch (Exception unused) {
            int i2 = elg.a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0263 A[Catch: all -> 0x02a6, TryCatch #2 {all -> 0x02a6, blocks: (B:2:0x0000, B:3:0x000a, B:6:0x0013, B:8:0x001f, B:54:0x011e, B:9:0x0024, B:11:0x0030, B:12:0x0035, B:14:0x0041, B:15:0x0059, B:18:0x0064, B:20:0x006c, B:22:0x0074, B:25:0x007e, B:27:0x0086, B:30:0x008f, B:31:0x0094, B:49:0x00e4, B:51:0x00ee, B:52:0x010b, B:48:0x00d7, B:53:0x010f, B:57:0x0126, B:58:0x0134, B:59:0x013c, B:61:0x0142, B:62:0x015b, B:64:0x0161, B:69:0x0173, B:70:0x0184, B:71:0x018c, B:73:0x0193, B:74:0x01a7, B:76:0x01ad, B:78:0x01bf, B:80:0x01cb, B:81:0x01eb, B:83:0x01f1, B:84:0x01fe, B:86:0x0204, B:89:0x0214, B:91:0x022a, B:94:0x0234, B:95:0x0241, B:97:0x024a, B:98:0x0250, B:99:0x025d, B:101:0x0263, B:103:0x0273, B:105:0x028e, B:106:0x0296, B:108:0x029d), top: B:118:0x0000, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.efy e(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efm.e(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):efy");
    }
}
