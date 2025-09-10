package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tku implements tiw {
    private final tjb a;
    private final tjd b;
    private final tkg c;
    private final List d;
    private final int e;

    public tku(tjb tjbVar, int i, tjd tjdVar, tkg tkgVar, List list) {
        this.a = tjbVar;
        this.e = i;
        this.b = tjdVar;
        this.c = tkgVar;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!sla.z(accessibleObject, obj)) {
            throw new tim(tmf.e(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.tks c(defpackage.tih r26, defpackage.tmk r27, java.lang.Class r28, boolean r29, boolean r30) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tku.c(tih, tmk, java.lang.Class, boolean, boolean):tks");
    }

    private static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + tmf.d(field) + " and " + tmf.d(field2) + "\nSee " + sla.x("duplicate-fields"));
    }

    private final boolean e(Field field, boolean z) {
        tjd tjdVar = this.b;
        int i = tjdVar.c;
        if ((field.getModifiers() & 136) != 0) {
            return false;
        }
        double d = tjdVar.b;
        if (field.isSynthetic() || tjdVar.c(field.getType(), z)) {
            return false;
        }
        List list = z ? tjdVar.d : tjdVar.e;
        if (list.isEmpty()) {
            return true;
        }
        field.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((tia) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        Class cls = tmkVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        if (tmf.h(cls)) {
            return new tko();
        }
        int iA = sla.A(this.d);
        if (iA == 4) {
            throw new tim(mn.i(cls, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = iA == 3;
        return tmf.a.c(cls) ? new tkt(cls, c(tihVar, tmkVar, cls, z, true), z) : new tkr(this.a.a(tmkVar, true), c(tihVar, tmkVar, cls, z, false));
    }
}
