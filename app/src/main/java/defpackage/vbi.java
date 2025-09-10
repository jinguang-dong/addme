package defpackage;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbi extends CronetException {
    public vbi(HttpException httpException) {
        super(httpException.getMessage(), httpException);
    }
}
