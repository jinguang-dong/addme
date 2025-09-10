package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.SizeF;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nms {
    private final pjp b;
    private final Set c;
    private final pjo d;
    private final boolean e;
    private final boolean f;
    private final Map g = new EnumMap(nmr.class);
    public int a = 0;

    public nms(pjp pjpVar, pjo pjoVar, hbj hbjVar) {
        boolean z = false;
        this.b = pjpVar;
        this.d = pjoVar;
        this.c = pjoVar.C();
        this.e = hbjVar.p(gzo.Z) && pjoVar.M() && pjoVar.D();
        if (pjoVar.l().equals(pka.FRONT) && hbjVar.p(gza.a)) {
            z = true;
        }
        this.f = z;
    }

    private final synchronized pjo l(nmr nmrVar) {
        pjo pjoVarM = m(nmrVar);
        if (pjoVarM != null && this.c.size() != 1) {
            return pjoVarM;
        }
        return this.d;
    }

    private final synchronized pjo m(nmr nmrVar) {
        n();
        Map map = this.g;
        if (map.get(nmrVar) == null) {
            return null;
        }
        return this.b.a((pjr) map.get(nmrVar));
    }

    private final synchronized void n() {
        int length;
        Map map = this.g;
        nmr nmrVar = nmr.NARROWEST;
        if (map.get(nmrVar) == null || map.get(nmr.WIDEST) == null) {
            Set<pjr> set = this.c;
            Map map2 = new HashMap();
            ryo ryoVar = new ryo();
            Map map3 = new HashMap();
            float f = Float.MAX_VALUE;
            float f2 = Float.MIN_VALUE;
            for (pjr pjrVar : set) {
                pjo pjoVarA = this.b.a(pjrVar);
                float[] fArr = (float[]) pjoVarA.m(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                SizeF sizeF = (SizeF) pjoVarA.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                Integer num = (Integer) pjoVarA.m(CameraCharacteristics.LENS_POSE_REFERENCE);
                if (sizeF != null && fArr != null && (length = fArr.length) > 0) {
                    float f3 = f;
                    float f4 = f2;
                    int i = 0;
                    while (i < length) {
                        float f5 = fArr[i];
                        Pair pairCreate = Pair.create(Float.valueOf(f5), Float.valueOf(sizeF.getWidth() / f5));
                        int i2 = i;
                        pjr pjrVar2 = pjrVar;
                        p(pjrVar2, pairCreate, map2, ryoVar, map3);
                        if (ryoVar.t(pjrVar2)) {
                            if (!this.f || f5 != f3 || f5 != f4 || num == null) {
                                if (f5 >= f4) {
                                    map.put(nmrVar, pjrVar2);
                                    f4 = f5;
                                }
                                if (f5 <= f3) {
                                    map.put(nmr.WIDEST, pjrVar2);
                                    f3 = f5;
                                }
                            } else if (num.equals(0)) {
                                map.put(nmr.WIDEST, pjrVar2);
                            } else {
                                map.put(nmrVar, pjrVar2);
                            }
                        }
                        map2.put(pjrVar2, pairCreate);
                        pjrVar = pjrVar2;
                        i = i2 + 1;
                    }
                    f = f3;
                    f2 = f4;
                }
            }
            int i3 = ((ryb) ryoVar).b;
            this.a = i3;
            float fFloatValue = 0.0f;
            if (i3 == 3) {
                Iterator it = ryoVar.r().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Float f6 = (Float) it.next();
                    if (f6.floatValue() > f && f6.floatValue() < f2) {
                        map.put(nmr.MIDDLE, (pjr) ryoVar.b(f6).get(0));
                        fFloatValue = f6.floatValue();
                        break;
                    }
                }
            }
            o(nmrVar, nmr.NARROWEST_RM, f2, map3);
            o(nmr.MIDDLE, nmr.MIDDLE_RM, fFloatValue, map3);
            o(nmr.WIDEST, nmr.WIDEST_RM, f, map3);
        }
    }

    private final synchronized void o(nmr nmrVar, nmr nmrVar2, float f, Map map) {
        pjr pjrVar;
        Map map2 = this.g;
        if (((pjr) map2.get(nmrVar)) == null || (pjrVar = (pjr) map.get(Float.valueOf(f))) == null) {
            return;
        }
        map2.put(nmrVar2, pjrVar);
    }

    private final synchronized void p(pjr pjrVar, Pair pair, Map map, ryo ryoVar, Map map2) {
        Float f = (Float) pair.first;
        float fFloatValue = f.floatValue();
        float fFloatValue2 = ((Float) pair.second).floatValue();
        if (ryoVar.n(f)) {
            pjr pjrVar2 = (pjr) ryoVar.b(f).get(0);
            Pair pair2 = (Pair) map.get(pjrVar2);
            if (pair2 != null && fFloatValue == ((Float) pair2.first).floatValue()) {
                if (fFloatValue2 > ((Float) pair2.second).floatValue()) {
                    ryoVar.v(f, pjrVar2);
                    ryoVar.o(f, pjrVar);
                    map2.put(f, pjrVar2);
                    return;
                } else if (fFloatValue2 == ((Float) pair2.second).floatValue()) {
                    ryoVar.o(f, pjrVar);
                    return;
                } else {
                    map2.put(f, pjrVar);
                    return;
                }
            }
        }
        ryoVar.o(f, pjrVar);
    }

    public final synchronized nmr a(String str) {
        n();
        Map map = this.g;
        for (nmr nmrVar : map.keySet()) {
            if (str.equals(((pjr) map.get(nmrVar)).a)) {
                return nmrVar;
            }
        }
        return nmr.UNKNOWN;
    }

    public final pjo b(String str) {
        pjr pjrVar = null;
        if (str != null) {
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pjr pjrVar2 = (pjr) it.next();
                if (str.equals(pjrVar2.a)) {
                    pjrVar = pjrVar2;
                    break;
                }
            }
        }
        return pjrVar == null ? this.d : this.b.a(pjrVar);
    }

    public final synchronized pjo c() {
        return m(nmr.MIDDLE);
    }

    public final synchronized pjo d() {
        return m(nmr.MIDDLE_RM);
    }

    public final synchronized pjo e() {
        return l(nmr.NARROWEST);
    }

    public final synchronized pjo f() {
        return m(nmr.NARROWEST_RM);
    }

    public final synchronized pjo g() {
        if (!this.e) {
            return i();
        }
        pjo pjoVarC = c();
        if (pjoVarC != null) {
            return pjoVarC;
        }
        return e();
    }

    public final synchronized pjo h() {
        if (!this.e) {
            return j();
        }
        pjo pjoVarD = d();
        if (pjoVarD != null) {
            return pjoVarD;
        }
        return f();
    }

    public final synchronized pjo i() {
        return l(nmr.WIDEST);
    }

    public final synchronized pjo j() {
        return m(nmr.WIDEST_RM);
    }

    public final synchronized boolean k(String str) {
        n();
        Map map = this.g;
        nmr nmrVar = nmr.WIDEST;
        if (map.get(nmrVar) != null && str != null) {
            if (str.equals(((pjr) map.get(nmrVar)).a)) {
                return true;
            }
        }
        return false;
    }
}
