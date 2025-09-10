package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dcb {
    protected abstract String a();

    protected abstract void b(dey deyVar, Object obj);

    public final void d(ddo ddoVar, Object obj) throws Exception {
        ddoVar.getClass();
        if (obj == null) {
            return;
        }
        ddw ddwVarA = ddoVar.a(a());
        try {
            b(ddwVarA, obj);
            ddwVarA.j();
            ske.ay(ddwVarA, null);
        } finally {
        }
    }

    public final long c(ddo ddoVar, Object obj) throws Exception {
        ddoVar.getClass();
        ddw ddwVarA = ddoVar.a(a());
        try {
            b(ddwVarA, obj);
            ddwVarA.j();
            ske.ay(ddwVarA, null);
            if (cgh.x(ddoVar) == 0) {
                return -1L;
            }
            ddwVarA = ddoVar.a(clFzVRcygwbq.kjEHzeQaLA);
            try {
                ddwVarA.j();
                long jB = ddwVarA.b(0);
                ske.ay(ddwVarA, null);
                return jB;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
