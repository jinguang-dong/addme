package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcg extends RemoteCallbackList {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public dcg(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        ((dcd) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
