package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class det {
    public final Object a;
    public Object b;

    public det(dex dexVar) {
        this.a = dexVar;
    }

    public static final void f(int i) {
        cad.a.b(new bqd(i));
    }

    public final Bundle a(String str) {
        dex dexVar = (dex) this.a;
        if (!dexVar.e) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = dexVar.d;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = bundle.containsKey(str) ? deq.a(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            dexVar.d = null;
        }
        return bundleA;
    }

    public final void b(String str, des desVar) {
        desVar.getClass();
        Object obj = this.a;
        synchronized (((dex) obj).g) {
            Map map = ((dex) obj).b;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            map.put(str, desVar);
        }
    }

    public final void c(Class cls) throws NoSuchMethodException, SecurityException {
        if (!((dex) this.a).f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Object deoVar = this.b;
        if (deoVar == null) {
            deoVar = new deo(this);
        }
        this.b = deoVar;
        try {
            cls.getDeclaredConstructor(null);
            Object obj = this.b;
            if (obj != null) {
                String name = cls.getName();
                name.getClass();
                ((deo) obj).a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final des d() {
        des desVar;
        Object obj = this.a;
        synchronized (((dex) obj).g) {
            Iterator it = ((dex) obj).b.entrySet().iterator();
            do {
                desVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                des desVar2 = (des) entry.getValue();
                if (true == a.ao(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    desVar = desVar2;
                }
            } while (desVar == null);
        }
        return desVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azr, java.lang.Object] */
    public final void e(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void g(bvm bvmVar) {
        if (bvmVar.aw() == 5 && !bvmVar.ac() && !bvmVar.af() && !bvmVar.w && bvmVar.ah()) {
            bwe bweVar = bvmVar.s;
            if ((bweVar.a() & 256) != 0) {
                for (bij bijVar = bweVar.f; bijVar != null; bijVar = bijVar.q) {
                    if ((bijVar.n & 256) != 0) {
                        bup bupVarY = bijVar;
                        ?? bdpVar = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof buv) {
                                buv buvVar = (buv) bupVarY;
                                buvVar.cQ(bko.C(buvVar, 256));
                            } else if ((bupVarY.n & 256) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar2 = bupVarY.y;
                                int i = 0;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                                while (bijVar2 != null) {
                                    if ((bijVar2.n & 256) != 0) {
                                        i++;
                                        bdpVar = bdpVar;
                                        if (i == 1) {
                                            bupVarY = bijVar2;
                                        } else {
                                            if (bdpVar == 0) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar.n(bupVarY);
                                            }
                                            bdpVar.n(bijVar2);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar2 = bijVar2.q;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar);
                        }
                    }
                    if ((bijVar.o & 256) == 0) {
                        break;
                    }
                }
            }
        }
        bvmVar.v = false;
        bdp bdpVarI = bvmVar.i();
        Object[] objArr = bdpVarI.a;
        int i2 = bdpVarI.b;
        for (int i3 = 0; i3 < i2; i3++) {
            g((bvm) objArr[i3]);
        }
    }

    public final void h(bvm bvmVar) {
        ((bdp) this.a).n(bvmVar);
        bvmVar.v = true;
    }

    public det(kyz kyzVar) {
        this.a = kyzVar;
    }

    public det(byte[] bArr) {
        this.a = new bdp(new bvm[16]);
    }

    public det() {
        this.a = new azz(false, bap.c);
    }
}
