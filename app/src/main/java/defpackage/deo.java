package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class deo implements des {
    public final Set a = new LinkedHashSet();

    public deo(det detVar) {
        detVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.des
    public final Bundle a() {
        Bundle bundleG = coe.g((uev[]) Arrays.copyOf(new uev[0], 0));
        List listBN = ske.bN(this.a);
        bundleG.putStringArrayList("classes_to_restore", listBN instanceof ArrayList ? (ArrayList) listBN : new ArrayList<>(listBN));
        return bundleG;
    }
}
