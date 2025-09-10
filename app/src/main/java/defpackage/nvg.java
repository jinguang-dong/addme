package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum nvg {
    BADGE("badge"),
    EDIT("edit"),
    INTERACT("interact"),
    LAUNCH("launch");

    private static final Set f;
    public final String e;

    static {
        nvg nvgVar = BADGE;
        nvg nvgVar2 = EDIT;
        nvg nvgVar3 = INTERACT;
        nvg nvgVar4 = LAUNCH;
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(nvgVar.e, nvgVar2.e, nvgVar3.e)));
        f = setUnmodifiableSet;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        hashSet.add(nvgVar4.e);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    nvg(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
