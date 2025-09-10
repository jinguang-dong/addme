package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ofo extends BasePendingResult implements ofp {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ofo(oew oewVar) {
        super(oewVar);
        ojl.az(oewVar, "GoogleApiClient must not be null");
    }

    private final void c(RemoteException remoteException) {
        h(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(oej oejVar);

    public /* bridge */ /* synthetic */ void d(Object obj) {
        throw null;
    }

    public final void g(oej oejVar) throws DeadObjectException {
        try {
            b(oejVar);
        } catch (DeadObjectException e) {
            c(e);
            throw e;
        } catch (RemoteException e2) {
            c(e2);
        }
    }

    public final void h(Status status) {
        ojl.aq(!status.b(), "Failed result must not be success");
        k(a(status));
    }
}
