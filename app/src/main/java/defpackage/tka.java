package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tka extends tiv {
    public static final tiw a = new tke(1);
    private final Class b;
    private final tiv c;

    public tka(tiv tivVar, Class cls) {
        this.c = new tkx(tivVar);
        this.b = cls;
    }

    @Override // defpackage.tiv
    public final Object a(tml tmlVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        tmlVar.l();
        while (tmlVar.r()) {
            arrayList.add(this.c.a(tmlVar));
        }
        tmlVar.n();
        int size = arrayList.size();
        Class cls = this.b;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }
}
