package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esu {
    public final cnj a;
    public final List b;
    public final String c;

    public esu(Class cls, Class cls2, Class cls3, List list, cnj cnjVar) {
        this.a = cnjVar;
        eoz.i(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
