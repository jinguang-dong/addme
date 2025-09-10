package defpackage;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkf extends tiv {
    static final tiw a = new tke(0);
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public tkf(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                tiy tiyVar = (tiy) field2.getAnnotation(tiy.class);
                if (tiyVar != null) {
                    strName = tiyVar.a();
                    for (String str : tiyVar.b()) {
                        this.b.put(str, r4);
                    }
                }
                this.b.put(strName, r4);
                this.c.put(string, r4);
                this.d.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        String strJ = tmlVar.j();
        Enum r0 = (Enum) this.b.get(strJ);
        return r0 != null ? r0 : (Enum) this.c.get(strJ);
    }
}
