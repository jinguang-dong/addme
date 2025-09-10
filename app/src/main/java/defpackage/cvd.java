package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvd {
    public static final List a;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.5f);
        a = rnt.ae(new uev[]{new uev(fValueOf, fValueOf), new uev(fValueOf2, fValueOf2)});
    }

    public static final long a(cvc cvcVar) {
        List list = cvcVar.b;
        return a.t((((cux) ske.bB(list)).a() + ((cux) ske.bF(list)).c()) / 2.0f, (((cux) ske.bB(list)).b() + ((cux) ske.bF(list)).d()) / 2.0f);
    }
}
