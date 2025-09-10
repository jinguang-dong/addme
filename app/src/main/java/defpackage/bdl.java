package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bdl {
    public final zu a;

    public static final Object a(zu zuVar, Object obj) {
        Object objA = zuVar.a(obj);
        if (objA == null) {
            return null;
        }
        if (!(objA instanceof zo)) {
            zuVar.g(obj);
            return objA;
        }
        zo zoVar = (zo) objA;
        if (zoVar.f()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = zoVar.b - 1;
        Object objC = zoVar.c(i);
        zoVar.h(i);
        objC.getClass();
        if (zoVar.f()) {
            zuVar.g(obj);
        }
        if (zoVar.b != 1) {
            return objC;
        }
        zuVar.j(obj, zoVar.b());
        return objC;
    }

    public static final void b(zu zuVar, Object obj, Object obj2) {
        int iF = zuVar.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : zuVar.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof zo) {
                zo zoVar = (zo) obj3;
                zoVar.o(obj2);
                obj2 = zoVar;
            } else {
                obj2 = zp.c(obj3, obj2);
            }
        }
        if (!z) {
            zuVar.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        zuVar.b[i] = obj;
        zuVar.c[i] = obj2;
    }

    public static final void c(zu zuVar, Object obj, uiq uiqVar) {
        Object objA = zuVar.a(obj);
        if (objA != null) {
            if (!(objA instanceof zo)) {
                if (((Boolean) uiqVar.a(objA)).booleanValue()) {
                    zuVar.g(obj);
                    return;
                }
                return;
            }
            zo zoVar = (zo) objA;
            int i = zoVar.b;
            Object[] objArr = zoVar.a;
            int i2 = 0;
            ukv ukvVarU = ukc.u(0, i);
            int i3 = ukvVarU.a;
            int i4 = ukvVarU.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) uiqVar.a(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            rnt.af(objArr, null, i - i2, i);
            zoVar.b -= i2;
            if (zoVar.f()) {
                zuVar.g(obj);
            }
            if (zoVar.b == 0) {
                zuVar.j(obj, zoVar.b());
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bdl) && a.ao(this.a, ((bdl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
