package com.example.layoutapplication;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"},
        d2 = {"Lcom/example/layoutapplication/ViewPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/layoutapplication/ViewPagerAdapter$Pager2ViewHolder;", "topic", "", "", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Pager2ViewHolder", "LayoutApplication.app"}
)
public final class ViewPagerAdapterJava extends RecyclerView.Adapter {
    private List topic;

    @NotNull
    public ViewPagerAdapter.Pager2ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkParameterIsNotNull(parent, "parent");
        View var10003 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_page, parent, false);
        Intrinsics.checkExpressionValueIsNotNull(var10003, "LayoutInflater.from(pare…t.item_page,parent,false)");
        return new ViewPagerAdapter.Pager2ViewHolder(var10003);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public int getItemCount() {
        return this.topic.size();
    }

    public void onBindViewHolder(@NotNull ViewPagerAdapter.Pager2ViewHolder holder, int position) {
        Intrinsics.checkParameterIsNotNull(holder, "holder");
        holder.getItemTitle().setText((CharSequence)this.topic.get(position));
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((ViewPagerAdapter.Pager2ViewHolder)var1, var2);
    }

    public void ViewPagerAdapter(@NotNull List topic) {
        Intrinsics.checkParameterIsNotNull(topic, "topic");
        this.topic = topic;
    }

    @Metadata(
            mv = {1, 1, 16},
            bv = {1, 0, 3},
            k = 1,
            d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"},
            d2 = {"Lcom/example/layoutapplication/ViewPagerAdapter$Pager2ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/layoutapplication/ViewPagerAdapter;Landroid/view/View;)V", "itemImage", "Landroid/widget/ImageView;", "getItemImage", "()Landroid/widget/ImageView;", "itemTitle", "Landroid/widget/TextView;", "getItemTitle", "()Landroid/widget/TextView;", "LayoutApplication.app"}
    )
    public final class Pager2ViewHolder extends RecyclerView.ViewHolder {
        @NotNull
        private final TextView itemTitle;
        @NotNull
        private final ImageView itemImage;

        @NotNull
        public final TextView getItemTitle() {
            return this.itemTitle;
        }

        @NotNull
        public final ImageView getItemImage() {
            return this.itemImage;
        }


        public Pager2ViewHolder(@NotNull final View itemView) {
            super(itemView);
            Intrinsics.checkParameterIsNotNull(itemView, "itemView");
            View var10001 = itemView.findViewById(R.id.tvAbout);
            Intrinsics.checkExpressionValueIsNotNull(var10001, "itemView.findViewById(R.id.tvAbout)");
            this.itemTitle = (TextView)var10001;
            var10001 = itemView.findViewById(R.id.imgProfile);
            Intrinsics.checkExpressionValueIsNotNull(var10001, "itemView.findViewById(R.id.imgProfile)");
            this.itemImage = (ImageView)var10001;
            this.itemImage.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
                public final void onClick(@NotNull View v) {
                    Intrinsics.checkParameterIsNotNull(v, "v");
                    int position = Pager2ViewHolder.this.getAbsoluteAdapterPosition();
                    Toast.makeText(itemView.getContext(), (CharSequence)("You clicked on item " + (position + 1)), 0).show();
                }
            }));
        }
    }
}
