package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kb extends jh {
    final int c;
    final int d;
    public ka e;
    private MenuItem f;

    public kb(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.jh, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        fy fyVar;
        int headersCount;
        ka kaVar;
        ka kaVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                fyVar = (fy) headerViewListAdapter.getWrappedAdapter();
            } else {
                fyVar = (fy) adapter;
                headersCount = 0;
            }
            gd item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= fyVar.getCount()) ? null : fyVar.getItem(i);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                gb gbVar = fyVar.a;
                if (menuItem != null && (kaVar2 = ((kc) this.e).a) != null) {
                    ((fu) kaVar2).a.a.removeCallbacksAndMessages(gbVar);
                }
                this.f = item;
                if (item != null && (kaVar = ((kc) this.e).a) != null) {
                    fu fuVar = (fu) kaVar;
                    fv fvVar = fuVar.a;
                    Handler handler = fvVar.a;
                    handler.removeCallbacksAndMessages(null);
                    List list = fvVar.b;
                    int size = list.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (gbVar == ((tym) list.get(i2)).b) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        handler.postAtTime(new dwq(fuVar, i3 < list.size() ? (tym) list.get(i3) : null, (MenuItem) item, gbVar, 1), gbVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (fy) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (fy) adapter).a.i(false);
        return true;
    }
}
