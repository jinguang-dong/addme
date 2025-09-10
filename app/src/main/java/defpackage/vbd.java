package defpackage;

import org.chromium.net.CallbackException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbd extends CallbackException {
    public vbd(android.net.http.CallbackException callbackException) {
        super(callbackException.getMessage(), callbackException.getCause());
    }
}
