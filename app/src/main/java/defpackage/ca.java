package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ca implements ob {
    final /* synthetic */ ch a;
    private final /* synthetic */ int b;

    public ca(ch chVar, int i) {
        this.b = i;
        this.a = chVar;
    }

    @Override // defpackage.ob
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ch chVar = this.a;
            oa oaVar = (oa) obj;
            cc ccVar = (cc) chVar.t.pollLast();
            if (ccVar == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            co coVar = chVar.b;
            String str = ccVar.a;
            bm bmVarC = coVar.c(str);
            if (bmVarC == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                bmVarC.onActivityResult(ccVar.b, oaVar.a, oaVar.b);
                return;
            }
        }
        if (i != 1) {
            ch chVar2 = this.a;
            oa oaVar2 = (oa) obj;
            cc ccVar2 = (cc) chVar2.t.pollFirst();
            if (ccVar2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            co coVar2 = chVar2.b;
            String str2 = ccVar2.a;
            bm bmVarC2 = coVar2.c(str2);
            if (bmVarC2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                bmVarC2.onActivityResult(ccVar2.b, oaVar2.a, oaVar2.b);
                return;
            }
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        ch chVar3 = this.a;
        cc ccVar3 = (cc) chVar3.t.pollFirst();
        if (ccVar3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        co coVar3 = chVar3.b;
        String str3 = ccVar3.a;
        if (coVar3.c(str3) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        }
    }
}
