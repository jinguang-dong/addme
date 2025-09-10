package kotlinx.coroutines;

import defpackage.azn;
import defpackage.uhd;
import defpackage.uhf;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends uhd {
    public static final azn c = azn.d;

    void handleException(uhf uhfVar, Throwable th);
}
