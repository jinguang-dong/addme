package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class skp extends sko {
    public static final Map c;
    private final shz d;

    static {
        EnumMap enumMap = new EnumMap(shz.class);
        for (shz shzVar : shz.values()) {
            skp[] skpVarArr = new skp[10];
            for (int i = 0; i < 10; i++) {
                skpVarArr[i] = new skp(i, shzVar, sia.a);
            }
            enumMap.put((EnumMap) shzVar, (shz) skpVarArr);
        }
        c = DesugarCollections.unmodifiableMap(enumMap);
    }

    public skp(int i, shz shzVar, sia siaVar) {
        super(siaVar, i);
        shzVar.getClass();
        this.d = shzVar;
        if (siaVar.c()) {
            return;
        }
        int i2 = shzVar.l;
        i2 = siaVar.d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        siaVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.sko
    public final void a(sks sksVar, Object obj) throws IOException {
        sksVar.d(obj, this.d, this.b);
    }
}
