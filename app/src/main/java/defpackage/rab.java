package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rab {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(final int... iArr) {
        if (b.compareAndSet(false, true)) {
            ocq.a().b(new oci() { // from class: raa
                @Override // defpackage.oci
                public final void a(oca ocaVar) {
                    int i = rab.a;
                    try {
                        ocaVar.c(iArr);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            });
        }
    }
}
