package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cij {
    public cij() {
    }

    public static final int A(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iIntValue;
        try {
            try {
                iIntValue = sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                objInvoke.getClass();
                iIntValue = ((Integer) objInvoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            iIntValue = 0;
        }
        if (iIntValue < 0 || iIntValue > 4) {
            return 0;
        }
        return iIntValue;
    }

    public static final List B(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? ufw.a : list;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                objInvoke.getClass();
                return (List) objInvoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return ufw.a;
        }
    }

    public static final List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static /* synthetic */ String c(List list, CharSequence charSequence, uiq uiqVar, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append((i & 2) != 0 ? "" : null);
        int size = list.size();
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c2 = (i & 8) != 0 ? (char) 65535 : (char) 0;
            if (i2 >= size) {
                c = c2;
                break;
            }
            Object obj = list.get(i2);
            i3++;
            if (i3 > 1) {
                sb.append(1 != (i & 1) ? charSequence : ", ");
            }
            if (c2 >= 0 && i3 > 0) {
                break;
            }
            a.F(sb, obj, (i & 32) != 0 ? null : uiqVar);
            i2++;
        }
        if (c >= 0 && i3 > 0) {
            sb.append((CharSequence) ((i & 16) != 0 ? "..." : null));
        }
        sb.append((CharSequence) ((i & 4) == 0 ? null : ""));
        return sb.toString();
    }

    public static final float d(float f, float f2, float f3, float f4, float f5) {
        return f + ((f2 - f) * Math.max(0.0f, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static /* synthetic */ urk f(urk urkVar, cwc cwcVar) {
        cwb cwbVar = cwb.d;
        cwcVar.getClass();
        cwbVar.getClass();
        return new urf(new cwx(cwcVar, cwbVar, urkVar, (uhb) null, 1));
    }

    public static final long g(float[] fArr) {
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            int length = fArr.length;
            if (i >= length) {
                float f3 = length >> 1;
                return a.t(f / f3, f2 / f3);
            }
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cvj h(float[] fArr, cuw cuwVar, List list, float f, float f2) {
        int i;
        int i2;
        float f3;
        float f4;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        float f5;
        List listBj;
        cux cuxVarC;
        uev uevVar;
        int size = list.size();
        if (size + size != 8) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 1;
            if (i7 >= 4) {
                break;
            }
            cuw cuwVar2 = (cuw) list.get(i7);
            cuw cuwVar3 = cuwVar2 == null ? cuwVar : cuwVar2;
            int i8 = 3 & (i7 + 3);
            int i9 = i7 + 1;
            int i10 = i9 & 3;
            int i11 = i8 + i8;
            int i12 = i7 + i7;
            int i13 = i10 + i10;
            arrayList3.add(new cvh(a.t(fArr[i11], fArr[i11 + 1]), a.t(fArr[i12], fArr[i12 + 1]), a.t(fArr[i13], fArr[i13 + 1]), cuwVar3));
            i7 = i9;
        }
        ukv ukvVarU = ukc.u(0, 4);
        ArrayList arrayList4 = new ArrayList(ske.bq(ukvVarU, 10));
        ugd ugdVarA = ukvVarU.iterator();
        while (true) {
            f3 = 1.0f;
            f4 = 0.0f;
            if (!((uku) ugdVarA).a) {
                break;
            }
            int iA = ugdVarA.a();
            int i14 = (iA + 1) % 4;
            float f6 = ((cvh) arrayList3.get(iA)).g + ((cvh) arrayList3.get(i14)).g;
            float f7 = ((cvh) arrayList3.get(iA)).g + ((cvh) arrayList3.get(i14)).g;
            int i15 = iA + iA;
            int i16 = i14 + i14;
            float fA = cvk.a(fArr[i15] - fArr[i16], fArr[i15 + 1] - fArr[i16 + 1]);
            if (f6 > fA) {
                uevVar = new uev(Float.valueOf(fA / f6), Float.valueOf(0.0f));
            } else if (f7 > fA) {
                uevVar = new uev(Float.valueOf(1.0f), Float.valueOf((fA - f6) / (f7 - f6)));
            } else {
                Float fValueOf = Float.valueOf(1.0f);
                uevVar = new uev(fValueOf, fValueOf);
            }
            arrayList4.add(uevVar);
        }
        int i17 = 0;
        for (i = 4; i17 < i; i = 4) {
            yi yiVar = new yi(2);
            int i18 = i6;
            while (i18 < 2) {
                uev uevVar2 = (uev) arrayList4.get(((i17 + 3) + i18) % i);
                yiVar.c((((cvh) arrayList3.get(i17)).g * ((Number) uevVar2.a).floatValue()) + ((((cvh) arrayList3.get(i17)).g - ((cvh) arrayList3.get(i17)).g) * ((Number) uevVar2.b).floatValue()));
                i18++;
                f3 = f3;
            }
            float f8 = f3;
            cvh cvhVar = (cvh) arrayList3.get(i17);
            float fA2 = yiVar.a(i6);
            float fA3 = yiVar.a(i2);
            float fMin = Math.min(fA2, fA3);
            float f9 = cvhVar.g;
            if (f9 < 1.0E-4f || fMin < 1.0E-4f) {
                i3 = i6;
            } else {
                i3 = i6;
                float f10 = cvhVar.f;
                if (f10 >= 1.0E-4f) {
                    float fMin2 = Math.min(fMin, f9);
                    float fA4 = cvhVar.a(fA2);
                    float fA5 = cvhVar.a(fA3);
                    float f11 = (f10 * fMin2) / f9;
                    int i19 = cvk.a;
                    float fSqrt = (float) Math.sqrt((f11 * f11) + (fMin2 * fMin2));
                    long j = cvhVar.b;
                    i5 = i2;
                    arrayList = arrayList4;
                    long j2 = cvhVar.d;
                    float f12 = f4;
                    long j3 = cvhVar.e;
                    f5 = f12;
                    cvhVar.h = n(j, o(l(k(n(j2, j3), 2.0f)), fSqrt));
                    long jN = n(j, o(j2, fMin2));
                    long jN2 = n(j, o(j3, fMin2));
                    cux cuxVarB = cvh.b(fMin2, fA4, j, cvhVar.a, jN, jN2, cvhVar.h, f11);
                    cux cuxVarB2 = cvh.b(fMin2, fA5, j, cvhVar.c, jN2, jN, cvhVar.h, f11);
                    cux cuxVarC2 = cpn.c(cuxVarB2.c(), cuxVarB2.d(), cuxVarB2.g(), cuxVarB2.h(), cuxVarB2.e(), cuxVarB2.f(), cuxVarB2.a(), cuxVarB2.b());
                    cux[] cuxVarArr = new cux[3];
                    cuxVarArr[i3] = cuxVarB;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cvhVar.h >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cvhVar.h & 4294967295L));
                    float fC = cuxVarB.c();
                    float fD = cuxVarB.d();
                    float fA6 = cuxVarC2.a();
                    float fB = cuxVarC2.b();
                    float f13 = fC - fIntBitsToFloat;
                    float f14 = fD - fIntBitsToFloat2;
                    float f15 = fA6 - fIntBitsToFloat;
                    float f16 = fB - fIntBitsToFloat2;
                    long jC = cvk.c(f13, f14);
                    i4 = i17;
                    long jC2 = cvk.c(f15, f16);
                    long jD = cvk.d(jC);
                    long jD2 = cvk.d(jC2);
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD >> 32)) * f15;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD & 4294967295L)) * f16;
                    float fI = i(jC, jC2);
                    if (fI > 0.999f) {
                        cuxVarC = cpn.d(fC, fD, fA6, fB);
                    } else {
                        float fA7 = ((((cvk.a(f13, f14) * 4.0f) / 3.0f) * (((float) Math.sqrt(r9 + r9)) - ((float) Math.sqrt(f8 - (fI * fI))))) / (f8 - fI)) * (fIntBitsToFloat3 + fIntBitsToFloat4 >= f5 ? f8 : -1.0f);
                        cuxVarC = cpn.c(fC, fD, (Float.intBitsToFloat((int) (jD >> 32)) * fA7) + fC, fD + (Float.intBitsToFloat((int) (jD & 4294967295L)) * fA7), fA6 - (Float.intBitsToFloat((int) (jD2 >> 32)) * fA7), fB - (Float.intBitsToFloat((int) (jD2 & 4294967295L)) * fA7), fA6, fB);
                    }
                    cuxVarArr[i5] = cuxVarC;
                    cuxVarArr[2] = cuxVarC2;
                    listBj = rnt.ae(cuxVarArr);
                }
                arrayList2.add(listBj);
                i17 = i4 + 1;
                f3 = f8;
                arrayList4 = arrayList;
                i6 = i3;
                i2 = i5;
                f4 = f5;
            }
            i4 = i17;
            i5 = i2;
            arrayList = arrayList4;
            f5 = f4;
            long j4 = cvhVar.b;
            cvhVar.h = j4;
            listBj = ske.bj(cpn.d(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L))));
            arrayList2.add(listBj);
            i17 = i4 + 1;
            f3 = f8;
            arrayList4 = arrayList;
            i6 = i3;
            i2 = i5;
            f4 = f5;
        }
        int i20 = i6;
        int i21 = i2;
        float f17 = f4;
        ArrayList arrayList5 = new ArrayList();
        while (i6 < 4) {
            int i22 = i6 + 1;
            int i23 = i6 + i6;
            long jT = a.t(fArr[i23], fArr[i23 + 1]);
            int i24 = (i6 + 3) % 4;
            int i25 = i24 + i24;
            long jT2 = a.t(fArr[i25], fArr[i25 + 1]);
            int i26 = i22 % 4;
            int i27 = i26 + i26;
            long jT3 = a.t(fArr[i27], fArr[i27 + 1]);
            int i28 = cvk.a;
            long jM = m(jT, jT2);
            long jM2 = m(jT3, jT);
            arrayList5.add(new cva((List) arrayList2.get(i6), (Float.intBitsToFloat((int) (jM >> 32)) * Float.intBitsToFloat((int) (jM2 & 4294967295L))) - (Float.intBitsToFloat((int) (jM & 4294967295L)) * Float.intBitsToFloat((int) (jM2 >> 32))) > f17 ? i21 : i20));
            arrayList5.add(new cvb(ske.bj(cpn.d(((cux) ske.bF((List) arrayList2.get(i6))).c(), ((cux) ske.bF((List) arrayList2.get(i6))).d(), ((cux) ske.bB((List) arrayList2.get(i26))).a(), ((cux) ske.bB((List) arrayList2.get(i26))).b()))));
            i6 = i22;
        }
        long jT4 = a.t(f17, f17);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jT4 >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jT4 & 4294967295L));
        if (arrayList5.size() < 2) {
            throw new IllegalArgumentException("Polygons must have at least 2 features");
        }
        ugl uglVar = new ugl((byte[]) null);
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            for (cux cuxVar : ((cvc) it.next()).b) {
                uglVar.add(Float.valueOf(cuxVar.a()));
                uglVar.add(Float.valueOf(cuxVar.b()));
            }
        }
        float[] fArrBS = ske.bS(ske.bi(uglVar));
        if (Float.isNaN(fIntBitsToFloat5)) {
            fIntBitsToFloat5 = Float.intBitsToFloat((int) (g(fArrBS) >> 32));
        }
        if (Float.isNaN(fIntBitsToFloat6)) {
            fIntBitsToFloat6 = Float.intBitsToFloat((int) (g(fArrBS) & 4294967295L));
        }
        return new cvj(arrayList5, a.t(fIntBitsToFloat5, fIntBitsToFloat6));
    }

    public static final float i(long j, long j2) {
        return (Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (j2 >> 32))) + (Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final float j(long j) {
        return (float) Math.sqrt((Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (j >> 32))) + (Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public static final long k(long j, float f) {
        return a.t(Float.intBitsToFloat((int) (j >> 32)) / f, Float.intBitsToFloat((int) (j & 4294967295L)) / f);
    }

    public static final long l(long j) {
        float fJ = j(j);
        if (fJ > 0.0f) {
            return k(j, fJ);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final long m(long j, long j2) {
        return a.t(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final long n(long j, long j2) {
        return a.t(Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final long o(long j, float f) {
        return a.t(Float.intBitsToFloat((int) (j >> 32)) * f, Float.intBitsToFloat((int) (j & 4294967295L)) * f);
    }

    public static final cvf p(cpo cpoVar, cvj cvjVar) {
        List listBj;
        ArrayList<cux> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = cvjVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cvc cvcVar = (cvc) list.get(i);
            List list2 = cvcVar.b;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((cvcVar instanceof cva) && i2 == list2.size() / 2) {
                    arrayList2.add(new uev(cvcVar, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i2));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iBq = ske.bq(arrayList, 9);
        if (iBq == 0) {
            listBj = ske.bj(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iBq + 1);
            arrayList3.add(fValueOf);
            for (cux cuxVar : arrayList) {
                float fFloatValue = fValueOf.floatValue();
                float fD = cpo.d(cuxVar);
                if (fD < 0.0f) {
                    throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                fValueOf = Float.valueOf(fFloatValue + fD);
                arrayList3.add(fValueOf);
            }
            listBj = arrayList3;
        }
        float fFloatValue2 = ((Number) ske.bF(listBj)).floatValue();
        yi yiVar = new yi(listBj.size());
        int size3 = listBj.size();
        for (int i3 = 0; i3 < size3; i3++) {
            yiVar.c(((Number) listBj.get(i3)).floatValue() / fFloatValue2);
        }
        ugl uglVar = new ugl((byte[]) null);
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            int iIntValue = ((Number) ((uev) arrayList2.get(i4)).b).intValue();
            float fA = yiVar.a(iIntValue) + yiVar.a(iIntValue + 1);
            int i5 = cvk.a;
            uglVar.add(new cvg(cvk.e(fA / 2.0f), (cvc) ((uev) arrayList2.get(i4)).a));
        }
        return new cvf(cpoVar, ske.bi(uglVar), arrayList, yiVar);
    }

    public static /* synthetic */ syu q(uhf uhfVar, uiu uiuVar) {
        uhfVar.getClass();
        return cgh.k(new dww(uhfVar, uiuVar, 1));
    }

    public static final byte[] r(dvx dvxVar) {
        int i;
        dvxVar.getClass();
        int i2 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i3 = 1;
                dataOutputStream.writeShort(1);
                Map map = dvxVar.b;
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i2);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i3);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        if (!(value instanceof Object[])) {
                            Class<?> cls = value.getClass();
                            int i4 = ukb.a;
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new uji(cls).c())));
                        }
                        Object[] objArr = (Object[]) value;
                        Class<?> cls2 = objArr.getClass();
                        int i5 = ukb.a;
                        uji ujiVar = new uji(cls2);
                        int i6 = 11;
                        int i7 = 10;
                        int i8 = 8;
                        if (a.ao(ujiVar, new uji(Boolean[].class))) {
                            i = 8;
                        } else if (a.ao(ujiVar, new uji(Byte[].class))) {
                            i = 9;
                        } else if (a.ao(ujiVar, new uji(Integer[].class))) {
                            i = 10;
                        } else if (a.ao(ujiVar, new uji(Long[].class))) {
                            i = 11;
                        } else if (a.ao(ujiVar, new uji(Float[].class))) {
                            i = 12;
                        } else if (a.ao(ujiVar, new uji(Double[].class))) {
                            i = 13;
                        } else {
                            if (!a.ao(ujiVar, new uji(String[].class))) {
                                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new uji(objArr.getClass()).b())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i9 = 0;
                        while (i9 < length) {
                            Object obj = objArr[i9];
                            if (i == i8) {
                                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                Byte b = obj instanceof Byte ? (Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i7) {
                                Integer num = obj instanceof Integer ? (Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i6) {
                                Long l = obj instanceof Long ? (Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                Float f = obj instanceof Float ? (Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                Double d = obj instanceof Double ? (Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                String str2 = obj instanceof String ? (String) obj : null;
                                if (str2 == null) {
                                    str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str2);
                            }
                            i9++;
                            i8 = 8;
                            i6 = 11;
                            i7 = 10;
                        }
                    }
                    dataOutputStream.writeUTF(str);
                    i2 = 0;
                    i3 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ujk.e(dataOutputStream, null);
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            String str3 = dvy.a;
            dwj.b();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final dvx s(Map map) {
        dvx dvxVar = new dvx(map);
        r(dvxVar);
        return dvxVar;
    }

    public static final void t(Map map, Map map2) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                int i = ukb.a;
                uji ujiVar = new uji(value.getClass());
                if (!a.ao(ujiVar, new uji(Boolean.TYPE)) && !a.ao(ujiVar, new uji(Byte.TYPE)) && !a.ao(ujiVar, new uji(Integer.TYPE)) && !a.ao(ujiVar, new uji(Long.TYPE)) && !a.ao(ujiVar, new uji(Float.TYPE)) && !a.ao(ujiVar, new uji(Double.TYPE)) && !a.ao(ujiVar, new uji(String.class)) && !a.ao(ujiVar, new uji(Boolean[].class)) && !a.ao(ujiVar, new uji(Byte[].class)) && !a.ao(ujiVar, new uji(Integer[].class)) && !a.ao(ujiVar, new uji(Long[].class)) && !a.ao(ujiVar, new uji(Float[].class)) && !a.ao(ujiVar, new uji(Double[].class)) && !a.ao(ujiVar, new uji(String[].class))) {
                    int i2 = 0;
                    if (a.ao(ujiVar, new uji(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = dvy.a;
                        objArr = new Boolean[length];
                        while (i2 < length) {
                            objArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                    } else if (a.ao(ujiVar, new uji(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int length2 = bArr.length;
                        String str3 = dvy.a;
                        objArr = new Byte[length2];
                        while (i2 < length2) {
                            objArr[i2] = Byte.valueOf(bArr[i2]);
                            i2++;
                        }
                    } else if (a.ao(ujiVar, new uji(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length3 = iArr.length;
                        String str4 = dvy.a;
                        objArr = new Integer[length3];
                        while (i2 < length3) {
                            objArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                    } else if (a.ao(ujiVar, new uji(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length4 = jArr.length;
                        String str5 = dvy.a;
                        objArr = new Long[length4];
                        while (i2 < length4) {
                            objArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                    } else if (a.ao(ujiVar, new uji(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length5 = fArr.length;
                        String str6 = dvy.a;
                        objArr = new Float[length5];
                        while (i2 < length5) {
                            objArr[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                    } else {
                        if (!a.ao(ujiVar, new uji(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + ujiVar);
                        }
                        double[] dArr = (double[]) value;
                        int length6 = dArr.length;
                        String str7 = dvy.a;
                        objArr = new Double[length6];
                        while (i2 < length6) {
                            objArr[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                    }
                    value = objArr;
                }
            }
            map2.put(str, value);
        }
    }

    public static final void u(String str, Object obj, Map map) {
        map.put(str, obj);
    }

    public static final void v(String str, boolean z, Map map) {
        u(str, Boolean.valueOf(z), map);
    }

    public static final dvv w(boolean z, boolean z2, ecy ecyVar, boolean z3, Set set, int i) {
        return new dvv(ecyVar, i, z, z2, z3, false, -1L, -1L, ske.bQ(set));
    }

    public static final Executor x(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new dvt(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static final IBinder y(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static final duk z() throws NumberFormatException {
        String apiVersion;
        String strGroup;
        try {
            apiVersion = SidecarProvider.getApiVersion();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        if (TextUtils.isEmpty(apiVersion) || apiVersion == null || ujp.r(apiVersion)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
        if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 != null) {
                int i2 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                if (strGroup3 != null) {
                    int i3 = Integer.parseInt(strGroup3);
                    String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                    strGroup4.getClass();
                    return new duk(i, i2, i3, strGroup4);
                }
            }
        }
        return null;
    }

    public cij(cjn cjnVar) {
        new WeakReference(cjnVar);
        cjf.o(cjnVar.J);
        cjf.o(cjnVar.K);
        cjf.o(cjnVar.L);
        cjf.o(cjnVar.M);
        cjf.o(cjnVar.N);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(android.content.Context r13, int r14, android.util.SparseArray r15, android.util.SparseArray r16) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cij.e(android.content.Context, int, android.util.SparseArray, android.util.SparseArray):void");
    }
}
