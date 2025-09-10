package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbp {
    public static final /* synthetic */ int a = 0;
    private static final AtomicInteger b = new AtomicInteger(0);

    public static final int a() {
        return b.addAndGet(1);
    }

    public static final bik b(bik bikVar, boolean z, uiq uiqVar) {
        return bikVar.cM(new AppendedSemanticsElement(z, uiqVar));
    }
}
